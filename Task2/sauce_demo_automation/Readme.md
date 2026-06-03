# SauceDemo Automation Project

## Project Overview
This project automates the SauceDemo web application using Selenium WebDriver with Java.  
It covers basic test scenarios such as login, product selection, checkout, and locked user validation.

---

## Tools Used
- Java
- Selenium WebDriver
- ChromeDriver
- IntelliJ IDEA
- Chrome Browser

---

## Project Type
- Java Project
- Executed using main() method

---

## How to Set Up the Project

### 1. Install Prerequisites

- Java JDK (8 or above)
- IntelliJ IDEA
- Google Chrome Browser
- ChromeDriver (matching Chrome version)

---

# 2. pom.xml (Maven dependencies)
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>SauceDemoAutomation</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>

        <!-- Selenium -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.20.0</version>
        </dependency>

    </dependencies>

</project>