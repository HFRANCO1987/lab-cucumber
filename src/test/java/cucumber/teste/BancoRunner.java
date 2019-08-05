package cucumber.teste;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "classpath:caracteristicas", 
tags = "@BancoTeste",
//tags = "@tipo1",
//tags = {"@tipo1", "@tipo2"}, executa onde tem as 2 tags
//tags = {"@tipo1, @tipo2"}, execute onde tem uma ou outra tag
//tags = "~@ignore",
glue = "cucumber.teste.passos", monochrome = true, dryRun = false)
public class BancoRunner {

}
