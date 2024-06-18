plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("kotlin-kapt")
    //id("dagger.hilt.android.plugin") version "2.40.5"
    id("dagger.hilt.android.plugin")


}

android {
    namespace = "com.bldsht.runnnboyrun"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.bldsht.runnnboyrun"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

//    implementation(libs.androidx.core.ktx)
//    implementation(libs.androidx.appcompat)
//    implementation(libs.material)
//    implementation(libs.androidx.activity)
//    implementation(libs.androidx.constraintlayout)
//    testImplementation(libs.junit)
//    androidTestImplementation(libs.androidx.junit)
//    androidTestImplementation(libs.androidx.espresso.core)

    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13")
    androidTestImplementation("androidx.test.ext:junit:1.1.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")

    // Material Design
    implementation("com.google.android.material:material:1.12.0")
//
//    // Architectural Components
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.2")
//
//    // Room
    implementation("androidx.room:room-runtime:2.6.1")
    kapt("androidx.room:room-compiler:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")

    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.5")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.5")
//
//    // Coroutine Lifecycle Scopes
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.2.0")

    // Navigation Components
    implementation("androidx.navigation:navigation-fragment-ktx:2.3.0")
    implementation("androidx.navigation:navigation-ui-ktx:2.3.0")

    // Glide
    implementation("com.github.bumptech.glide:glide:4.11.0")
    kapt("com.github.bumptech.glide:compiler:4.11.0")
//
//    // Google Maps Location Services
    implementation("com.google.android.gms:play-services-location:17.0.0")
    implementation("com.google.android.gms:play-services-maps:17.0.0")

    // Dagger Core
    implementation("com.google.dagger:dagger:2.51.1")
    kapt("com.google.dagger:dagger-compiler:2.51.1")

    // Activity KTX for ViewModels
    implementation("androidx.activity:activity-ktx:1.9.0")

    // Dagger - Hilt
    implementation("com.google.dagger:hilt-android:2.28-alpha")
    kapt("com.google.dagger:hilt-android-compiler:2.28-alpha")


    implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha01")
    kapt("androidx.hilt:hilt-compiler:1.0.0-alpha01")

    // Dagger Android
    api("com.google.dagger:dagger-android:2.51.1")
    api("com.google.dagger:dagger-android-support:2.51.1")
    kapt("com.google.dagger:dagger-android-processor:2.51.1")

    // Easy Permissions
    implementation("pub.devrel:easypermissions:3.0.0")

    // Timber
    implementation("com.jakewharton.timber:timber:4.7.1")

    // MPAndroidChart (Uncomment if needed)
    // implementation("com.github.PhilJay:MPAndroidChart:v3.1.0")
}