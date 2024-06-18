import java.net.URI

// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }

        dependencies {
        //noinspection UseTomlInstead
        classpath("com.android.tools.build:gradle:8.4.2")
        //noinspection UseTomlInstead
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
        //noinspection UseTomlInstead
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.7")
        //noinspection UseTomlInstead
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.40.1")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}


allprojects {
//    repositories {
//        mavenCentral() // Replace jcenter() with mavenCentral()
//        maven { url = URI("https://jitpack.io") }
//    }

}