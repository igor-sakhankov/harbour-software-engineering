plugins {
    java
    id("jacoco")
    id("maven-publish")
}

group = "com.harbour"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/igor-sakhankov/harbour-software-engineering")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
    publications {
        register<MavenPublication>("gpr") {
            from(components["java"])
        }
    }
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

val jacocoTestReport = tasks.named<JacocoReport>("jacocoTestReport") {
    executionData.from(fileTree(project.buildDir.absolutePath).include("jacoco/*.exec"))
    classDirectories.setFrom(files(project.sourceSets.main.get().output))
    sourceDirectories.setFrom(files(project.sourceSets.main.get().allSource.srcDirs))

    reports {
        xml.required.set(true)
        csv.required.set(false)
        html.required.set(true)
    }
}
