# ~ Eclipse project template with Cucumber ~

This repository contains a Maven project created in Eclipse IDE, used to setup a test environment with the use of: **Java**, **Maven**, **Junit**, **Gherkin** and **Cucumber**.
The project has been created in Eclipse configured with the following installation procedure.

### Installation procedure

- **Install the following software**

  - **[Eclipse for java](https://www.eclipse.org/downloads/packages/release/2018-09/r/eclipse-ide-java-developers "https://www.eclipse.org/downloads/packages/release/2018-09/r/eclipse-ide-java-developers")** - Cross-plattform and cross-language IDE with powerful tools.

  - [M2Eclipse plugin](https://www.eclipse.org/m2e/ "www.eclipse.org/m2e") - M2Eclipse plugin provides integration for Apache Maven into the Eclipse IDE. To install it into Eclipse don't use the Marketplace but install a new software (Eclipse> Help> Install New Software...) using this site: http://download.eclipse.org/technology/m2e/releases/

  - [Cucumber Plugin](https://cucumber.github.io/cucumber-eclipse/ "https://cucumber.github.io/cucumber-eclipse/") - Official Eclipse plugin to use Cucumber. Cucumber is a tool that supports Behaviour-Driven Development (BDD). To install Cucumber in eclipse, don't use the Marketplace but install it as new software (Eclipse> Help> Install New Software...) using this site: http://cucumber.github.io/cucumber-eclipse/update-site/

  - [ANSI Escape in Console plugin](https://marketplace.eclipse.org/content/ansi-escape-console "https://marketplace.eclipse.org/content/ansi-escape-console") - This plugin interprets the ANSI escape sequences to color the console output. Useful to correctly read Cucumber Test results output on Eclipse Console. It can be installed from Eclipse Marketplace.

- **Create an empty Cucumber project using Maven POM**

  - From the official cucumber tutorial, get the [maven command to create an empty cucumber project](https://docs.cucumber.io/guides/10-minute-tutorial/#create-an-empty-cucumber-project "https://docs.cucumber.io/guides/10-minute-tutorial/#create-an-empty-cucumber-project") and launch it on your shell with the prompt positioned on a desired path.

  - Update the Maven dependencies contained into the pom.xml with the lates one available on [maven repository](https://mvnrepository.com "https://mvnrepository.com").
