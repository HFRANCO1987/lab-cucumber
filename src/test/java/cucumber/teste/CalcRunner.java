package cucumber.teste;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"html:target/cucumber-html-report",
				"json:target/cucumber-json-report.json"},
		features = "classpath:caracteristicas"
)
public class CalcRunner {

}
