pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        maven("https://maven.aliyun.com/nexus/content/groups/public/")
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven.aliyun.com/repository/jcenter")
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        maven("https://maven.aliyun.com/nexus/content/groups/public/")
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven.aliyun.com/repository/jcenter")
        maven("https://maven.aliyun.com/repository/gradle-plugin")
//        google()
        mavenCentral()
    }
}
rootProject.name = "testnewKotlin"
include (":app")
include(":mylibrary")
include(":mylibrary2")
include(":kotlinstand")
