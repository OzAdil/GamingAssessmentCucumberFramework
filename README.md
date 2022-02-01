Framework Overview


This assessment developed BDD Automation-Testing Framework using technologies like Cucumber, Rest Assured library, Hamcrest framework.

For Question1= Created feature file=Test.feature, step definition=RemainingCards, and Runner class. Also created configuration.properties for storing sensitive data and created ConfigurationReader to read the configuration properties file. In addition; added some reusable methods and POJO classes.As a final; configured cucumber report as html, json, xml formats

For Question2= Created fetaure file=FIRSTNAME_LASTNAME_MG.feature, used scenario outline for run the same scenario multiple times, with different combinations of values. 


About Cucumber;
Cucumber is a testing tool that supports BDD framework. It defines application behavior by using Gherkin language in the feature file to make sure that the test cases are understandable for each member in the team.

There are 3 main components of Cucumber:
1) Feature file
2) Step Definitions
3) Runner class


Feature file: 
We use Gherkin language.
It has some keywords such as: Feature, Scenario, Scenario Outline, Examples, Given, And, When, Then...
So, Gherkin language is that Gherkin keywords + simple English


Step Definitions:
Step Definition is a small piece of code or a java method in a class with an annotation above it. 
An annotation followed by the pattern is used to link the Step Definition to all the matching Steps, and the code is what Cucumber will execute when it sees a Gherkin Step.


Runner Class
The Test Runner File uses the @RunWith() Annotation from JUnit for executing tests. It also uses the @CucumberOptions Annotation to define the location of feature files, step definitions, reporting integrations, etc.


Jenkins
Jenkins is a popular CI orchestration tool. It provides numerous plugins for integration with multiple test automation tools and frameworks into the test pipeline. When it comes to test automation, Jenkins provides plugins that help run test suites, gather and dashboard results, and provide details on failures.For this project configurated the Jenkins pipeline and once team members push code it will automatically run test cases.






