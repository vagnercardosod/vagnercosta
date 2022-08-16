package testesensedata;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import metodos.MetodosDeTeste;

public class TesteSenseData_Login {

	MetodosDeTeste metodos = new MetodosDeTeste();
	By pesquisar;

	@Before
	public void setUp() throws Exception {
		metodos.abrirNavegador(" https://www.saucedemo.com");

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void fazerlogin () {
		By pesquisar = By.xpath("//input[@id=\"user-name\"]");
		metodos.escrever( pesquisar , "standard_user");
		
		By senha = By.xpath("//input[@id=\"password\"]");
		metodos.escrever( senha , "secret_sauce");
	
		By click =  By.xpath("//input[@id=\"login-button\"]");
		metodos.clicar(click);
		
	By seletor = By.className("product_sort_container");
	metodos.entrar(seletor);
	
	By menorpreco = By.cssSelector("#header_container > div.header_secondary_container > div.right_component > span > select > option:nth-child(3)");
	metodos.entrar(menorpreco);
		
	    By body = By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]");
	 metodos.entrar(body);
	 
	 By camisa = By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]");
	 metodos.entrar(camisa);
	   
	 By carinnho = By.className("shopping_cart_link");
	 metodos.entrar(carinnho);
	 
	 By finalizar =  By.xpath("//*[@id=\"checkout\"]");
	 metodos.entrar(finalizar);
	 
	 By nome = By.xpath("//*[@id=\"first-name\"]");
		metodos.escrever( nome , "vagner");
		
		By sobrenome = By.xpath("//*[@id=\"last-name\"]");
		metodos.escrever( sobrenome , "cardoso");
		
		By codigopostal = By.xpath("//*[@id=\"postal-code\"]");
		metodos.escrever( codigopostal , "28942826");
		
		 By continuar =  By.xpath("//*[@id=\"continue\"]");
		 metodos.entrar(continuar);
		
		 By concluir =  By.xpath("//*[@id=\"finish\"]");
		 metodos.entrar(concluir);
		
	
	 
		
		

	}

}
