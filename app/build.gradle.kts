import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("com.squareup.sqldelight")
    application
}

group = "com.kamilh"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(project(":moduleA"))
    implementation(project(":moduleB"))
    implementation("com.squareup.sqldelight:runtime:1.5.3")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}