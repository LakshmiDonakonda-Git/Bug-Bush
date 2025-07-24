# Bug-Bush
# Bug Bush Login Automation

## Overview
BDD Automation using Selenium, Java, Cucumber, Maven.

## Project Structure
- Feature files in `src/test/resources/features`
- Step definitions in `src/test/java/stepdefs`
- Page Objects in `src/main/java/pages`

## Prerequisites
- Java 8+
- Maven
- Edge browser

## Setup
1. Clone this repo
2. Run `mvn clean install`
3. Run tests using `TestRunner.java` or `mvn test`

## Test Data
- Valid user: admin@shophub.com  /  admin123 
- Invalid user: admin@shophub.com  / admin1234 

## Reports
- HTML report: `target/cucumber.html`
- JSON report:`target/cucumber.json
