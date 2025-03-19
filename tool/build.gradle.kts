import org.gradle.api.artifacts.Configuration
import java.nio.file.Files
import java.nio.file.StandardCopyOption

plugins {
    id("java")
}

group = "com.seirengames"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.thymeleaf:thymeleaf:+")
    implementation("org.slf4j:slf4j-simple:+")
}

tasks.register<JavaExec>("runEnumGenerator") {
    dependsOn("extractLibrarySources")
    group = "codegen"
    description = "Run the code generator"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("com.seirengames.EnumGenerator")
}

tasks.register("extractLibrarySources") {
    group = "custom"
    description = "Extracts sources from jaylib-ffm and saves them to the project"

    val dependencyNotation = "io.github.electronstudio:jaylib-ffm:+:sources@jar"
    val libsDir = layout.projectDirectory.dir("libs")
    val sourcesDir = layout.projectDirectory.dir("src/extracted_sources")

    doLast {
        // コピー先のディレクトリを作成（存在しなければ）
        libsDir.asFile.mkdirs()
        
        // Gradleの `configurations` で依存関係を解決
        val config: Configuration = configurations.detachedConfiguration(
            dependencies.create(dependencyNotation)
        )
        config.isTransitive = false // 依存関係の依存関係は含めない
        config.resolve().forEach { file ->
            val destFile = libsDir.file(file.name).asFile

            // JARファイルを `libs/` にコピー
            Files.copy(file.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING)
            println("Copied: ${file.name} -> ${destFile}")

            // ソース JAR がある場合は `src/extracted_sources/` に展開
            if (file.name.endsWith("-sources.jar")) {
                copy {
                    from(zipTree(file))
                    into(sourcesDir)
                }
                println("Extracted sources to: ${sourcesDir}")
            }
        }
    }
}

tasks.register("extractFunctions") {
    dependsOn("extractLibrarySources")
    doLast {
        val javaFile = file("src/extracted_sources/com/raylib/Raylib.java")
        if (!javaFile.exists()) {
            println("Raylib.java が見つかりません")
            return@doLast
        }
        val content = javaFile.readText(Charsets.UTF_8)
        // 正規表現パターン:
        //   1. オプションのJavaDocコメント部分 (/** ... */) をキャプチャ
        //   2. public static の後に戻り値や型、関数名、引数リストをキャプチャし、その後に { が続くもの
        val regex = Regex(
            """((?:\s*/\*\*(?:[^*]|\*(?!/))*\*/\s*)?)(public\s+static\s+[\w<>\[\]]+\s+\w+\s*\([^)]*\))\s*\{""",
            RegexOption.DOT_MATCHES_ALL
        )
        val matches = regex.findAll(content).map { match ->
            val comment = match.groupValues[1]
            val signature = match.groupValues[2]
            if (comment.isNotBlank()) {
                // コメントがある場合は、コメント部分（前後の余分な空白を除去）と関数シグネチャを改行区切りで結合し、末尾にセミコロンを追加
                comment.trimEnd() + "\n" + signature.trim() + ";"
            } else {
                // コメントがない場合は、もともとの処理（余分な空白を除去）
                signature.split("\\s+".toRegex()).joinToString(" ") + ";"
            }
        }.toList()
        
        // 出力ファイルに書き込む
        val outputFile = file("extracted_functions.txt")
        outputFile.writeText(matches.joinToString("\n"))
        
        println("抽出された関数が ${outputFile.path} に保存されました")
    }
}
