object Dep {

    object Accompanist {
        private const val version = "0.13.0"
        const val coil = "com.google.accompanist:accompanist-coil:${version}"
    }

    object AndroidX {
        private const val appCompatVersion = "1.3.0-rc01"
        private const val fragmentKtxVersion = "1.3.3"
        const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"
        const val fragmentKtx = "androidx.fragment:fragment-ktx:$fragmentKtxVersion"
    }

    object Application {
        const val appId = ""
        const val versionCode = 1
        const val versionName = "1.0"
        const val minSdk = 21
        const val compileSdk = 30
        const val targetSdk = 29
    }

    object Build {
        private const val gradleBuildTools = "7.1.0-beta05"
        const val buildTools = "com.android.tools.build:gradle:${gradleBuildTools}"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
        const val sqlDelightGradlePlugin = "com.squareup.sqldelight:gradle-plugin:${SQLDelight.sqlDelightVersion}"
        const val hiltGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:${Hilt.version}"
    }

    object Compose {
        const val composeVersion = "1.0.5"
        const val runtime = "androidx.compose.runtime:runtime:${composeVersion}"
        const val runtimeLiveData = "androidx.compose.runtime:runtime-livedata:${composeVersion}"
        const val ui = "androidx.compose.ui:ui:${composeVersion}"
        const val material = "androidx.compose.material:material:${composeVersion}"
        const val uiTooling = "androidx.compose.ui:ui-tooling:${composeVersion}"
        const val foundation = "androidx.compose.foundation:foundation:${composeVersion}"
        const val compiler = "androidx.compose.compiler:compiler:${composeVersion}"

        private const val constraintLayoutComposeVersion = "1.0.0-alpha07"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout-compose:${constraintLayoutComposeVersion}"

        private const val composeActivitiesVersion = "1.3.0-rc01"
        const val activity = "androidx.activity:activity-compose:${composeActivitiesVersion}"

        private const val composeNavigationVerson = "2.4.0-alpha01"
        const val navigation = "androidx.navigation:navigation-compose:${composeNavigationVerson}"
    }

    object Google {
        private const val materialVersion = "1.3.0"
        const val material = "com.google.android.material:material:$materialVersion"
    }

    object Hilt {
        const val version = "2.38.1"
        const val hiltAndroid = "com.google.dagger:hilt-android:$version"
        const val hiltCompiler = "com.google.dagger:hilt-compiler:$version"

        private const val hiltNavigationVersion = "1.0.0-alpha03"
        const val hiltNavigation = "androidx.hilt:hilt-navigation:$hiltNavigationVersion"
    }

    object Kotlin {
         const val version = "1.5.31"
        //const val version = "1.6.10"
    }

    object KotlinPlugins {
        const val android = "android"
        const val multiplatform = "multiplatform"
        const val cocoapods = "native.cocoapods"
        const val serialization = "plugin.serialization"
        const val kapt = "kapt"
    }

    object Kotlinx {
        private const val kotlinxDatetimeVersion = "0.2.1"
        const val datetime = "org.jetbrains.kotlinx:kotlinx-datetime:${kotlinxDatetimeVersion}"
    }

    object Ktor {
        private const val ktorVersion = "1.6.7"
        const val core = "io.ktor:ktor-client-core:${ktorVersion}"
        const val clientSerialization = "io.ktor:ktor-client-serialization:${ktorVersion}"
        const val android = "io.ktor:ktor-client-android:${ktorVersion}"
        const val ios = "io.ktor:ktor-client-ios:${ktorVersion}"
    }

    object Plugins {
        const val androidApplication = "com.android.application"
        const val androidLibrary = "com.android.library"
        const val hilt = "dagger.hilt.android.plugin"
        const val sqlDelight = "com.squareup.sqldelight"
    }

    object SQLDelight {
        const val sqlDelightVersion = "1.4.3"
        const val runtime = "com.squareup.sqldelight:runtime:${sqlDelightVersion}"
        const val androidDriver = "com.squareup.sqldelight:android-driver:${sqlDelightVersion}"
        const val nativeDriver = "com.squareup.sqldelight:native-driver:${sqlDelightVersion}"
    }

    object SquareUp {
        private const val leakCanaryVersion = "2.7"
        const val leakCanary = "com.squareup.leakcanary:leakcanary-android:$leakCanaryVersion"
    }

}

