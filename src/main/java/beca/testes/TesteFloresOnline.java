package beca.testes;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import beca.helper.Print;

public class TesteFloresOnline {
	
	Print print;
	
	WebDriver driver;
	private final String EMAIL = "joaaaaaaaao@teste.com";
	private final String NOME_USUARIO = "Joao da Silva";
	private final String TELEFONE = "11940028922";
	private final String SENHA = "123465";

	@Test
	public void cadastrarUsuario() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mauricio\\Documents\\Drivers\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://www.floresonline.com.br/");
		Print.tiraPrint(driver, "URL");
		// Clicar nos botões necessários
		driver.findElement(By.linkText("Entre")).click();
		driver.findElement(By.linkText("Cadastre-se")).click();
		Print.tiraPrint(driver, "Campos");
		// Clicar e depois escrever
		driver.findElement(By.id("email_lp")).click();
		driver.findElement(By.id("email_lp")).sendKeys(EMAIL);
		Print.tiraPrint(driver, "Email");
		// Clicar e depois escrever
		driver.findElement(By.id("nome_lp")).click();
		driver.findElement(By.id("nome_lp")).sendKeys(NOME_USUARIO);
		Print.tiraPrint(driver, "Nome");
		// Clicar e depois escrever
		driver.findElement(By.id("telefone_lp")).click();
		driver.findElement(By.id("telefone_lp")).sendKeys(TELEFONE);
		Print.tiraPrint(driver, "Telefone");
		// Clicar e depois escrever
		driver.findElement(By.id("senha_lp")).click();
		driver.findElement(By.id("senha_lp")).sendKeys(SENHA);
		Print.tiraPrint(driver, "Senha");
		// Conclusão para criar conta
		driver.findElement(By.id("btnMain")).click();
		Print.tiraPrint(driver, "Conclusion");
		// Sair da conta
		//driver.findElement(By.linkText("Joao")).click();
		//driver.findElement(By.linkText("SAIR")).click();
		
	}
	
	@Test
	public void fluxoCompra() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mauricio\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.floresonline.com.br/");	
		//Montar o presente
		driver.findElement(By.linkText("Monte seu presente")).click();
		//Selecionar o endereco
		
	}

}
