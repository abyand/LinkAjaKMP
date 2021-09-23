pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "KMP_LinkAja"
include(":androidApp")
include(":shared")
include(":inbox:model")
include(":inbox:abstraction")
