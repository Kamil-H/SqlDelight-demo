allprojects {
    repositories {
        mavenCentral()
    }
}

buildscript {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
        classpath("com.squareup.sqldelight:gradle-plugin:1.5.3")
    }
}
