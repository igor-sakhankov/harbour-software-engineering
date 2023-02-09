plugins {
    java
    id("jacoco")
}

group = "com.harbour"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
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
