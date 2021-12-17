package testcases;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith (Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-report/"},
				features = "src/test/resources/featurefiles/Guru99.feature",
				tags="@Guru99Web")

public class Runner {
		void runTest() {
			
		} 
}
