plugins {
    java
    id("com.gradleup.shadow")
}

group = "win.clovelib.cpt"
version = "1.0.0"
description = "ClovesPluralTale - Core Hytale plugin"

repositories {
    mavenCentral()
    // Add Hytale/other repositories as needed when they become available
}

dependencies {
    // Hytale API dependency will go here when available
    // compileOnly("com.hytale:hytale-api:version")
    
    // Add any other dependencies
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

tasks {
    shadowJar {
        archiveBaseName.set("ClovesPluralTale")
        archiveClassifier.set("")
    }
    
    build {
        dependsOn(shadowJar)
    }
}