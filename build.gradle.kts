tasks.register<DefaultTask>("generateAndFormat") {
    group = "custom"
    description = "Generate code and run Spotless on lib project"

    dependsOn(":tool:runEnumGenerator")
    finalizedBy(":lib:spotlessApply")
}

tasks.register("fullBuild") {
    group = "custom"
    description = "Run code generation & formatting, and tests"
    
    dependsOn("generateAndFormat", ":lib:test")
}
