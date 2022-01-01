import Dep.KotlinPlugins.kapt

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin(Dep.KotlinPlugins.serialization) version Dep.Kotlin.version
    kotlin(Dep.KotlinPlugins.kapt)
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = 32
    defaultConfig {
        applicationId = "com.example.link.android"
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Dep.Compose.composeVersion
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

}

dependencies {
    implementation(project(":shared"))
    //implementation("com.google.android.material:material:1.4.0")
    //implementation("androidx.appcompat:appcompat:1.3.1")
    //implementation("androidx.constraintlayout:constraintlayout:2.1.0")

    implementation(Dep.Accompanist.coil)

    implementation(Dep.AndroidX.appCompat)
    implementation(Dep.AndroidX.fragmentKtx)

    implementation(Dep.Compose.runtime)
    implementation(Dep.Compose.runtimeLiveData)
    implementation(Dep.Compose.ui)
    implementation(Dep.Compose.material)
    implementation(Dep.Compose.uiTooling)
    implementation(Dep.Compose.foundation)
    implementation(Dep.Compose.compiler)
    implementation(Dep.Compose.constraintLayout)
    implementation(Dep.Compose.activity)
    implementation(Dep.Compose.navigation)

    implementation(Dep.Google.material)

    implementation(Dep.Hilt.hiltAndroid)
    implementation(Dep.Hilt.hiltNavigation)
    kapt(Dep.Hilt.hiltCompiler)

    implementation(Dep.Kotlinx.datetime)

    implementation(Dep.Ktor.android)
    debugImplementation(Dep.SquareUp.leakCanary)
}