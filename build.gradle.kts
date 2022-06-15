// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    //https://github.com/gradle/kotlin-dsl-conventions



    id("org.gradle.kotlin-dsl.ktlint-convention") version "0.7.0" //gradlew ktlintCheck VERIFICATION/ktlintcheck
    id("com.android.application") version "7.4.0-alpha03" apply false
    id("com.android.library") version "7.4.0-alpha03" apply false
    id("org.jetbrains.kotlin.android") version "1.6.21" apply false
}