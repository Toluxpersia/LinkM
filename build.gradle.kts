buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        jcenter()
    }
    dependencies {
        //classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
        //classpath("com.android.tools.build:gradle:7.1.0-beta05")
        classpath(Dep.Build.kotlinGradlePlugin)
        classpath(Dep.Build.buildTools)
        classpath(Dep.Build.hiltGradlePlugin)
        //classpath ("org.jetbrains.kotlin:kotlin-serialization:1.5.21")
        //classpath(Dep.KotlinPlugins.serialization)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}