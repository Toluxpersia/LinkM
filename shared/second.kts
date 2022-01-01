
plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    kotlin(Dep.KotlinPlugins.serialization) version Dep.Kotlin.version
    id("com.android.library")

}

version = "1.0"

android {
    compileSdk = 32
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = 21
        targetSdk = 32
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

kotlin {
    android()

    val iosTarget: (String, org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget.() -> Unit) -> org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget =
        if (System.getenv("SDK_NAME")?.startsWith("iphoneos") == true)
            ::iosArm64
        else if(System.getenv("SDK_NAME")?.startsWith("iphoneos") == true)
            :: iosX64
        else
            ::iosSimulatorArm64


    iosTarget("ios") {}

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        ios.deploymentTarget = "14.1"
        frameworkName = "shared"
        podfile = project.file("../iosLink/Podfile")
    }

    sourceSets {
        val commonMain by getting {
            dependencies{
                implementation(Dep.Kotlinx.datetime)
                implementation(Dep.Ktor.core)
                implementation(Dep.Ktor.clientSerialization)
            }
        }
        val androidMain by getting {
            dependencies{
                implementation(Dep.Ktor.android)
            }
        }
        val iosMain by getting{
            dependencies {
                implementation(Dep.Ktor.ios)
            }
        }
    }
}