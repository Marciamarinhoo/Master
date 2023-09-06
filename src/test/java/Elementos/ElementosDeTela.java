package Elementos;

import org.openqa.selenium.By;

public class ElementosDeTela {

	
	private By preencherDeTexto = By.id("input-search");
	private By btnClicarLupa = By.cssSelector("//*[@id=\"search-container\"]/div[1]/svg");
	private By btniphone12 = By.xpath("//*[@id=\"__next\"]/div/main/section[4]/div[3]/div/ul/li[1]/a/div[3]/h2");
	private By btnCarrinho = By.xpath("//*[@id=\"__next\"]/div/main/section[4]/div[7]/div[2]/button");
	
	

	
	public By getBtniphone12() {
		return btniphone12;
	}

	public By getBtnClicarLupa() {
		return btnClicarLupa;
	}
	
	public By getBtnCarrinho() {
		return btnCarrinho;
	}


	public By getPreencherDeTexto() {
		return preencherDeTexto;
	}


	
	
	
}
