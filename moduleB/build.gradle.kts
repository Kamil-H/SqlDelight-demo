plugins {
    kotlin("jvm")
    id("com.squareup.sqldelight")
}

sqldelight {
    database(name = "Database") {
        packageName = "com.kamilh.moduleB"
        dependency(project(":moduleA"))
    }
}

dependencies {
    implementation(project(":moduleA"))
    implementation("com.squareup.sqldelight:runtime:1.5.3")
}