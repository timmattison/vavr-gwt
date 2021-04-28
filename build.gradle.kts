plugins {
    kotlin("jvm") version "1.4.32"
    id("application")
    id("java")
    id("idea")
    id("java-library")
    id("maven-publish")
}

java.toolchain.languageVersion.set(JavaLanguageVersion.of(8))

val gradleDependencyVersion = "7.0"

tasks.wrapper {
    gradleVersion = gradleDependencyVersion
    distributionType = Wrapper.DistributionType.ALL
}

repositories {
    mavenLocal()
    maven(url = "https://oss.sonatype.org/content/repositories/snapshots")
    maven(url = "https://repo.maven.apache.org/maven2/")
}

dependencies {
    implementation("io.vavr:vavr:0.10.3")
    implementation("io.vavr:vavr:0.10.3")
    implementation("io.vavr:vavr-match:0.10.3")
    testImplementation("junit:junit:4.12")
    testImplementation("org.assertj:assertj-core:3.5.2")
    compileOnly("com.google.gwt:gwt-user:2.9.0")
    compileOnly("com.google.gwt:gwt-dev:2.9.0")
    testImplementation("com.google.gwt:gwt-user:2.9.0")
    testImplementation("com.google.gwt:gwt-dev:2.9.0")
}

group = "io.vavr"
version = "0.10.3"

publishing.publications.create<MavenPublication>("maven").from(components["java"])

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}
