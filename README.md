![Build status](https://github.com/pelaakso/java-template/actions/workflows/build-java.yml/badge.svg?branch=main)

# Java template project

Clone this repository for a quickstart on a new simple Java project.

## Specs

* Java 21
* JUnit 5

## Usage

```bash
jenv exec ./mvnw clean package
jenv exec java -jar target/vanilla-0.0.1-SNAPSHOT-package.jar
```

If not using `jenv`, just ignore the `jenv exec` part.
