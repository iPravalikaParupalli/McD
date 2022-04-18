package StepDefinition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features",
			glue= {"StepDefinition"},strict=true, monochrome=true,
			plugin= {"pretty","html:target/htmlreports","json:target/jsonreports/jsonreports.json"})

			public class TestRunner extends AbstractTestNGCucumberTests{

			
		}

