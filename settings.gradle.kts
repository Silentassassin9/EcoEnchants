pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
        maven("https://repo.auxilor.io/repository/maven-public/")
    }
}

rootProject.name = "EcoEnchants"

// Core
include(":eco-core")
include(":eco-core:core-plugin")
include(":eco-core:core-proxy")
include(":eco-core:core-nms")
include(":eco-core:core-nms:v1_17_R1")
include(":eco-core:core-nms:v1_18_R1")
include(":eco-core:core-nms:v1_18_R2")
include(":eco-core:core-nms:v1_19_R1")
include(":eco-core:core-nms:v1_19_R2")
include(":eco-core:core-nms:v1_19_R3")
include(":eco-core:core-nms:v1_20_R1")
include(":eco-core:core-nms:v1_20_R2")
