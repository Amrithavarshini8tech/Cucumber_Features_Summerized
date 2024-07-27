package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/login2.feature", glue="StepDefinitions", monochrome=true, dryRun=true, tags="@SmokeTest",
plugin= {"pretty","html: target/cucumber.html", "json: target/cucumber.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
//For this project we have used two dependencies: Cucumber - Java, Cucumber TestNG( For using cucumber with java)
//Also we downloaded two plugin's - Cucumber and TestNG from the marketplace

//How to use Tags in different ways
//1. Single tag:- tags="@SmokeTest"
//2. Run test cases which have both Smoke and Regression Tags together only: "@SmokeTest and @RegressionTest"
//3. Run test cases which have either Smoke or Regression Tags: @SmokeTest or @RegressionTest"
//4. Run all test cases except with tags RegressionTest: not @RegressionTest

// Monochrome= true: Able to read the report in the output

//AbstractTestNGCucumberTests: To use Cucumber with testNG, use this class extensions. If only cucumber, no need to use it. Here we are running testNG runners

//plugin: Used to show what kind of reporting we need.
//plugin takes multiple argument
//pretty: Used for giving color, e.g: red and green color for fail and pass
//if we need html report, give as key value pair
//"html: target/cucumber.html  - Create an html report under the target folder as cucumber.html"
//if we want to generate json file
//json: target/cucumber.json - json file created can be used to some third party report for pie chart report generation etc.

//dryRun - if dryRun is true, it means if any of the step definitions are not implemented, the whole project won't execute. If not present the execution will stop in the middle 


