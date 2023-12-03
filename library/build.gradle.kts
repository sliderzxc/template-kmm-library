import org.jetbrains.kotlin.gradle.dsl.ExplicitApiMode

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
}

kotlin {
    explicitApi = ExplicitApiMode.Strict
    jvmToolchain(11)

    androidTarget()
    jvm()
    js {
        browser()
        nodejs()
    }

    sourceSets {
        val commonMain by getting
        val jvmMain by getting
        val jsMain by getting
        val androidMain by getting
    }
}

android {
    namespace = "com.template.sample"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}