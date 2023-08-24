package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\login.feature"},//path of the feature file to be executed
		
		glue = {"steps"}, // package name where we have the glue code available
		
		publish = true// to generate the report post to the execution 
		
				,plugin = {"pretty","html:target/HTML/Result.html",   //preety folder karto for report 
						"junit:target/XML/Result.xml",
						"json:target/jsonReports/cucumber-report.json"
				/*"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"  --->compile---> test---> verify	*/}
		)

public class LoginRunner extends AbstractTestNGCucumberTests {

}
