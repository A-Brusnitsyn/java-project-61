plugins {
    id("io.github.ben-manes.versions") version "0.61.0"
    id("com.diffplug.spotless") version "8.10.1"
    application
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
application {
    mainClass = "hexlet.code.App"
}
tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

dependencies {
    implementation("org.apache.commons:commons-math3:3.6.1")
}

spotless {
    java {
        importOrder()
        removeUnusedImports()
        googleJavaFormat().aosp()
        formatAnnotations()
        leadingTabsToSpaces(4)
        endWithNewline()
    }
}
