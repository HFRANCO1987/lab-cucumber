package cucumber.teste.passos;



import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import cucumber.modelo.Banco;
import cucumber.modelo.Conta;

public class BancoTestePassos {

	  private Banco banco;
      private int totalContas;
      private Double totalDinheiro;
 
      @Dado("^que as contas sao do \"(.*?)\"$")
      public void que_as_contas_sao_do(String nome, List<Conta> listaDeContas) throws Throwable {
            // Definição do banco e associando as contas
            banco = new Banco(nome, listaDeContas);
 
      }
 
      @Dado("^o calculo do total de contas criadas$")
      public void o_calculo_do_total_de_contas_criadas() throws Throwable {
            totalContas = banco.getListaDeContas().size();
      }
 
      @Entao("^o total de contas e (\\d+)$")
      public void o_total_de_contas_e(int totalContasEsperado) throws Throwable {
            assertEquals("O cálculo do total de contas está incorreto", 
            totalContasEsperado, totalContas);
      }
 
      @Dado("^o calculo do total de dinheiro$")
      public void o_calculo_do_total_de_dinheiro() throws Throwable {
            totalDinheiro = banco.getListaDeContas().stream().mapToDouble
            (c -> c.getSaldo()).sum();
      }
 
      @Entao("^o total de dinheiro no banco e (\\d+)$")
      public void o_total_de_dinheiro_no_banco_e(Double totalDinheiroEsperado) 
        throws Throwable {
 
            assertEquals("O cálculo do total de dinheiro no banco " + banco.getNome() 
             + " está incorreto",
             totalDinheiroEsperado, totalDinheiro);
      }
      
      @Entao("^o valor informado para idade deve ser igual (\\d+)$")
      public void a_minha_idade_e(int idade) 
        throws Throwable {
    	  assertEquals("A idade deve ser igual a 30", 
    	            30, idade);
      }
      
      private int contador = 0;
      
      @Dado("^que o contador e (\\d+)$")
      public void que_o_contador_e(int arg1) throws Throwable {
    	  contador = arg1;
      }

      @Quando("^eu eu incrementar em (\\d+)$")
      public void eu_eu_incrementar_em(int arg1) throws Throwable {
         contador = contador + arg1;
      }

      @Entao("^o valor do contador sera (\\d+)$")
      public void o_valor_do_contador_sera(int arg1) throws Throwable {
//    	  throw new RuntimeException();
//    	  System.out.println(arg1);
//    	  System.out.println(contador);
//    	  System.out.println(arg1 == contador);
    	  Assert.assertTrue(arg1 == contador);
    	  Assert.assertEquals(arg1,contador);
      }
	
}
