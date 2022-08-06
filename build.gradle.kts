plugins {
    kotlin("jvm") version "1.6.21"
    id("com.github.johnrengelman.shadow") version "7.1.0"
}

group = "dev.Zeron.McForce"
version = "1.0"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

repositories {
    mavenCentral()
    mavenLocal()
    //mavenLocal() NMS 사용시에
    maven("https://repo.papermc.io/repository/maven-public/")

}

dependencies {
    implementation(kotlin("stdlib"))
    compileOnly("io.papermc.paper:paper-api:1.17.1-R0.1-SNAPSHOT") // compileOnly("io.papermc.paper:paper:1.17-R0.1-SNAPSHOT") NMS 사용 시에A

}
tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks {
    shadowJar {
        val loc = "C:\\Users\\USER\\Desktop\\1.17\\plugins"
        archiveBaseName.set(project.name)
        archiveClassifier.set("")
        archiveVersion.set(project.version.toString())
        doLast {
            // jar file copy
            copy {
                from(archiveFile)
                into(if (File(loc, archiveFileName.get()).exists()) loc else loc)
            }
        }
    }
}