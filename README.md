# ~ Eclipse project template with Cucumber ~

A Maven project template to use **Cucumber**, **Gherkin**, **Java** and **Junit**. Created in Eclipse IDE having the following setup.

### Setup procedure

- **Install the following software**

  - From the operating system, install the **[Eclipse for java](https://www.eclipse.org/downloads/packages/release/2018-09/r/eclipse-ide-java-developers "https://www.eclipse.org/downloads/packages/release/2018-09/r/eclipse-ide-java-developers")** IDE

  - From Eclipse IDE, install [M2Eclipse plugin](https://www.eclipse.org/m2e/ "www.eclipse.org/m2e"), it provides integration for Apache Maven into the Eclipse IDE. For the installation don't use the Marketplace but install a new software (Eclipse menu: Help> Install New Software...) using this site: http://download.eclipse.org/technology/m2e/releases/.

  - From Eclipse IDE, install [Cucumber Plugin](https://cucumber.github.io/cucumber-eclipse/ "https://cucumber.github.io/cucumber-eclipse/"),  Cucumber is a tool that supports Behaviour-Driven Development (BDD) and the plugin enables the its use in Eclipse. For the installation don't use Eclipse Marketplace but install it as new software (Eclipse menu: Help> Install New Software...) providing this site: http://cucumber.github.io/cucumber-eclipse/update-site/.

  - From Eclipse IDE, install [ANSI Escape in Console plugin](https://marketplace.eclipse.org/content/ansi-escape-console "https://marketplace.eclipse.org/content/ansi-escape-console"), it interprets the ANSI escape sequences to color the console output. Useful to correctly read Cucumber Test results output in Eclipse Console. For the installation use the Eclipse Marketplace (Eclipse menu: Help> Eclipse Marketplace... and search for "ANSI Escape in Console", then install it).

- **Create an empty Cucumber project using Maven POM**

  - From the official cucumber tutorial, get the [maven command to create an empty cucumber project](https://docs.cucumber.io/guides/10-minute-tutorial/#create-an-empty-cucumber-project "https://docs.cucumber.io/guides/10-minute-tutorial/#create-an-empty-cucumber-project") and copy/paste the command in your shell, at the project prompt.

  - Update Maven dependencies contained into the generated pom.xml, finding the latest releases on [maven repository](https://mvnrepository.com "https://mvnrepository.com").
