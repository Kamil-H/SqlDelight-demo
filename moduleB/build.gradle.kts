plugins {
    kotlin("jvm")
    id("com.squareup.sqldelight")
}

sqldelight {
    database(name = "Database") {
        packageName = "com.kamilh.moduleB"
    }
}

dependencies {
    implementation("com.squareup.sqldelight:runtime:1.5.3")
}