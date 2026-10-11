plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin
cat > app/build.gradle.kts << 'EOF'
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.omega.jarvis"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.omega.jarvis"
        minSdk = 24
        targetSdk = 34
        versionCode = 99999999
        versionName = "99999999"
    }
    buildTypes {
        release { isMinifyEnabled = false }
        debug { isMinifyEnabled = false }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}
dependencies {
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
}
