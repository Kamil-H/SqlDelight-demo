plugins {
    kotlin("jvm")
    id("com.squareup.sqldelight")
}

sqldelight {
    database(name = "Database") {
        packageName = "com.kamilh.moduleA"
        dependency(project(":moduleB"))
    }
}

dependencies {
    implementation(project(":moduleB"))
    implementation("com.squareup.sqldelight:runtime:1.5.3")
}