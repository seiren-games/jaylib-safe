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
    group = "codegen"
    description = "Run the code generator"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("com.seirengames.EnumGenerator")
}
