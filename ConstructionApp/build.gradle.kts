buildscript {
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.44")
        classpath("com.google.gms:google-services:4.3.10")  // Firebase Plugin
    }
}

plugins {
    id("com.android.application") version "8.0.2" apply true
    id("com.android.library") version "8.0.2" apply true
    id("org.jetbrains.kotlin.android") version "1.8.10" apply true
}
