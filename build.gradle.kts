import org.jetbrains.changelog.Changelog

fun properties(key: String) = providers.gradleProperty(key)

plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "2.2.0"
    id("org.jetbrains.intellij.platform") version "2.7.2"
    id("org.jetbrains.changelog") version "2.4.0"
}

group = "io.septimalmind.baboon"
version = properties("pluginVersion").get()

kotlin {
    jvmToolchain(21)
}

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

// Configure Gradle IntelliJ Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-intellij-platform-gradle-plugin.html
dependencies {
    intellijPlatform {
        create(properties("platformType"), properties("platformVersion"))
        testFramework(org.jetbrains.intellij.platform.gradle.TestFrameworkType.Platform)
    }
}

intellijPlatform {
    pluginConfiguration {
        ideaVersion {
            sinceBuild = properties("pluginSinceBuild")
            untilBuild = provider { null }
        }
    }

    pluginVerification {
        ides {
            create(properties("platformType"), properties("platformVersion"))
        }
    }
}

changelog {
    version.set(properties("pluginVersion").get())
    groups.set(emptyList())
}

tasks {

    patchPluginXml {
        changeNotes.set(provider {
            changelog.renderItem(
                changelog.get(properties("pluginVersion").get()),
                Changelog.OutputType.HTML
            )
        })
    }

    // Set the Gradle Version
    wrapper {
        gradleVersion = properties("gradleVersion").get()
    }

    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "21"
        targetCompatibility = "21"
    }
}

sourceSets["main"].java.srcDir("src/main/gen")
