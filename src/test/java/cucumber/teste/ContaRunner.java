package cucumber.teste;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/site/cucumber-pretty",
	    "json:target/cucumber.json"  }, features = "classpath:caracteristicas", 
        		tags = "@ContaTeste", glue = "cucumber.teste.passos",
        		monochrome = true, dryRun = false, snippets = SnippetType.CAMELCASE)
public class ContaRunner {

}
