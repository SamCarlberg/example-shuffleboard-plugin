import java.net.URI

group = "edu.wpi.first.shuffleboard"
version = "1.0-SNAPSHOT"

apply {
    plugin("java")
}

repositories {
    mavenCentral()
    maven {
        url = URI("http://first.wpi.edu/FRC/roborio/maven/release")
    }
}

dependencies {
    testCompile("junit", "junit", "4.12")
    implementation(group = "edu.wpi.first.shuffleboard", name = "api", version = "1.0.0")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
