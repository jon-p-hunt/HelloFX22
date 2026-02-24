Android Studio java program called HelloFX22 (uses google native UI instead of JavaFX)

SNIPPET - build.gradle: 

plugins {

    alias(libs.plugins.android.application) apply false

}

SNIPPET - gradle.properties:

org.gradle.jvmargs=-Xmx2048m -Dfile.encoding=UTF-8

android.useAndroidX=true

android.nonTransitiveRClass=true
