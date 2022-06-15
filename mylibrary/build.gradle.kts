import com.android.build.gradle.api.LibraryVariant

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.mylibrary"
    compileSdk = 32

    defaultConfig {
        minSdk = 24
        targetSdk = 32

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    System.err.println("--------------------len:" + libraryVariants.size + "-----------------------------")
    libraryVariants.forEach {
        print("librarylen" + it)
    }

    libraryVariants.all(Action {
        System.err.println("libraryVariants-------"+libraryVariants.size)
        this.javaCompileProvider.configure {
            System.err.println("this.javaCompileProvider.configure-------")
        }

    })
    libraryVariants.all { variant ->
        print("librarylen" + libraryVariants)
        variant.javaCompileProvider.configure {
            doLast {
                System.err.println("kts/module[${project.name}]Encrypt")
                var myprovider = variant.javaCompileProvider.get()
                print("build dir ${myprovider.destinationDirectory}\n")
            }
        }
        true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.4.1")
    implementation("com.google.android.material:material:1.5.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}