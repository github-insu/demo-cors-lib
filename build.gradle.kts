plugins {
    id("java")
}

group = "com.example"
version = "0.0.1-rc1"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.springframework:spring-webmvc:6.2.5")
    compileOnly("org.springframework.boot:spring-boot-autoconfigure:3.4.4")

    implementation("org.springframework.boot:spring-boot-starter-web:3.4.4")
}

tasks.test {
    useJUnitPlatform()
}