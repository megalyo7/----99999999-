plugins {
    id("com.android.application")
}
android {
    namespace = "com.omega.jarvis"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.omega.jarvis"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "OMEGA-99999999"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
}
