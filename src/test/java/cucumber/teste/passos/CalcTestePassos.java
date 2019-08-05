package cucumber.teste.passos;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import cucumber.modelo.Calc;

public class CalcTestePassos {
	
	private Calc calc;
	private int num1, num2;
	
	@Dado("^que eu escolha somar$")
	public void que_eu_escolha_somar() throws Throwable {
		this.calc = new Calc();
	}

	@Quando("^eu preencho o primeiro numero com valor (\\d+)$")
	public void eu_preencho_o_primeiro_numero_com_valor(int arg1) throws Throwable {
		this.num1 = arg1;
	}

	@Quando("^eu preencho o segundo numero com o valor (\\d+)$")
	public void eu_preencho_o_segundo_numero_com_o_valor(int arg1) throws Throwable {
		this.num2 = arg1;
	}

	@Entao("^eu devo ver o resultado como (\\d+)$")
	public void eu_devo_ver_o_resultado_como(int arg1) throws Throwable {
		Assert.assertEquals(arg1, calc.somar(this.num1, this.num2));
	}

}
