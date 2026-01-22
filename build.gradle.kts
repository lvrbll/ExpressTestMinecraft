import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
    id("com.gtnewhorizons.retrofuturagradle") version "2.0.2"
}

group = "net.lvrbl.expresstest"
version = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yy"))

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(8)
    }
}

minecraft {
    mcVersion = "1.7.10"
    username = "Dev${System.currentTimeMillis() % 1000}"
}

dependencies {

}