group = "org.anime_game_servers.multi_proto"
version = "0.2"
plugins {
    id("maven-publish")
    kotlin("multiplatform") version "2.1.0" apply false

}

repositories {
    mavenCentral()
}

allprojects {
    apply(plugin ="maven-publish")

    repositories {
        mavenLocal()
        mavenCentral()
        maven {
            name = "ags-mvn-Releases"
            url = uri("https://mvn.animegameservers.org/releases")
        }
        maven {
            name = "ags-mvn-snapshots"
            url = uri("https://mvn.animegameservers.org/snapshots")
        }
    }

    dependencies {
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }

    publishing {
        repositories {
            maven {
                name = "agsmvnrelease"
                url = uri("https://mvn.animegameservers.org/releases")
                credentials(PasswordCredentials::class)
                authentication {
                    create<BasicAuthentication>("basic")
                }
            }
            maven {
                name = "agsmvnsnapshots"
                url = uri("https://mvn.animegameservers.org/snapshots")
                credentials(PasswordCredentials::class)
                authentication {
                    create<BasicAuthentication>("basic")
                }
            }
        }
    }
}