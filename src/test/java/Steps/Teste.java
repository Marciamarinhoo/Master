package Steps;

import Elementos.ElementosDeTela;
import Metodos.MetodosDeTela;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
public class Teste {

	MetodosDeTela m = new MetodosDeTela();
	   ElementosDeTela e = new ElementosDeTela();
		
	   @Dado("que eu esteje no site {string}")
	   public void que_eu_esteje_no_site(String url) {
	      m.abrirNavegador(url);
	   }

	   @Quando("eu pesquisar o produto desejado iphone12")
	   public void eu_pesquisar_o_produto_desejado_tvsmart() throws InterruptedException {
		   Thread.sleep(2000);
	    m.preencherTexto(e.getPreencherDeTexto(),"iphone12");
	    Thread.sleep(2000);
		   m.clicar(e.getBtnClicarLupa());
	   }
	  

	   @Quando("Clicar no produto desejado")
	   public void clicar_no_produto_desejado() throws InterruptedException {
		   Thread.sleep(2000);
			 m.clicar(e.getBtniphone12());
		
		
	   }

	   @Quando("Clicar no botão adicionar ao carrinho")
	   public void clicar_no_botão_adicionar_ao_carrinho() throws InterruptedException {
		   Thread.sleep(3000);
			m.clicar(e.getBtnCarrinho());
	   }

	   @Entao("precisa ser direcionado para solicitação de login.")
	   public void precisa_ser_direcionado_para_solicitação_de_login() {
	      
	   }

	
	

}
