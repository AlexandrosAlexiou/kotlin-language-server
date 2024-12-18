plugins { id("java-platform") }

javaPlatform { allowDependencies() }

val kotlinVersion = "2.0.21"
val exposedVersion = "0.56.0"
val lsp4jVersion = "0.23.1"
val guavaVersion = "33.3.1-jre"
val h2DatabaseVersion = "1.4.200"
val jcommanderVersion = "1.78"
val hamcrestVersion = "1.3"
val junitVersion = "4.11"
val jmhVersion = "1.20"
val sqliteJdbcVersion = "3.41.2.1"

// constrain the dependencies that we use to these specific versions
dependencies {
    constraints {
        api("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
        api("org.hamcrest:hamcrest-all:$hamcrestVersion")
        api("junit:junit:$junitVersion")
        api("org.eclipse.lsp4j:org.eclipse.lsp4j:$lsp4jVersion")
        api("org.eclipse.lsp4j:org.eclipse.lsp4j.jsonrpc:$lsp4jVersion")
        api("org.jetbrains.kotlin:kotlin-compiler:$kotlinVersion")
        api("org.jetbrains.kotlin:kotlin-scripting-compiler:$kotlinVersion")
        api("org.jetbrains.kotlin:kotlin-scripting-jvm-host-unshaded:$kotlinVersion")
        api("org.jetbrains.kotlin:kotlin-sam-with-receiver-compiler-plugin:$kotlinVersion")
        api("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
        api("org.jetbrains.kotlin:kotlin-jvm:$kotlinVersion")
        api("org.jetbrains:fernflower:1.0")
        api("org.jetbrains.exposed:exposed-core:$exposedVersion")
        api("org.jetbrains.exposed:exposed-dao:$exposedVersion")
        api("org.jetbrains.exposed:exposed-jdbc:$exposedVersion")
        api("com.h2database:h2:$h2DatabaseVersion")
        api("com.github.fwcd.ktfmt:ktfmt:b5d31d1")
        api("com.beust:jcommander:$jcommanderVersion")
        api("org.hamcrest:hamcrest-all:$hamcrestVersion")
        api("junit:junit:$junitVersion")
        api("org.openjdk.jmh:jmh-core:$jmhVersion")
        api("org.jetbrains.kotlin:kotlin-scripting-jvm-host:$kotlinVersion")
        api("org.jetbrains.kotlin:kotlin-scripting-jvm-host:$kotlinVersion")
        api("org.openjdk.jmh:jmh-generator-annprocess:$jmhVersion")
        api("org.xerial:sqlite-jdbc:$sqliteJdbcVersion")
        api("com.google.guava:guava:$guavaVersion")
    }
}
