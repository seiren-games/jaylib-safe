tasks.register("fullBuild") {
    group = "custom"
    description = "Run code generation & formatting, and tests"
    
    dependsOn(":lib:spotlessApply")
    finalizedBy(":lib:test")
}
