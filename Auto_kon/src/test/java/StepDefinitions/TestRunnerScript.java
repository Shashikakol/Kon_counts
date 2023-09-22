package StepDefinitions;

import org.junit.runner.RunWith;

import Utilities.BrowserUtility;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Hometab.feature", glue= {"StepDefinitions"},
plugin= {"pretty", "html:target/cucumber-html.report","json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
  monochrome=true
//,@TestLoad3,@TestLoad4,@TestLoad5,@TestLoad6,@TestLoad7
    )
public class TestRunnerScript extends BrowserUtility
{


}
