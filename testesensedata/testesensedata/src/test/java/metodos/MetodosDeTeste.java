package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosDeTeste {

	WebDriver driver;

	// abrir navegador
	public void abrirNavegador(String url) {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}

// fecha navegador
	public void fecharNavegador() {
		driver.quit();

	}

	// inspecional e clicar
	public void escrever(By elemento, String texto) {

		driver.findElement(elemento).sendKeys(texto);

	}

	// metodo clicar
	public void clicar(By elemento) {

		driver.findElement(elemento).click();

	}
	public void entrar(By elemento) {

		driver.findElement(elemento).click();
		
	}
}

	

