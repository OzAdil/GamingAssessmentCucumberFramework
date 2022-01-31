package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //plugin Option is used to specify different formatting options for the output reports.
        // Various options that can be used as for-matters are:
        plugin={"pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        //Features Options helps Cucumber to locate the Feature file in the project folder structure.
        features = "src/test/java/Features",
        //Glue helps Cucumber to locate theStep Definition file.
        glue = "/StepDefinitions",
        //This option can either set as true or false (default value is false).
        // If it is set as true, it means that Cucumber will only checks that every Step mentioned in the Feature File have corresponding code written in Step Definition file or not.
        dryRun = true


)
public class Runner  {


    }


