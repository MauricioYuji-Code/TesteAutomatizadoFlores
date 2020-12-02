package beca.testes;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import beca.helper.Print;
import beca.helper.Word;

public class TesteFloresOnline {

	Print print;

	WebDriver driver;
	private final String EMAIL = "joaaaaaaaaaao@teste.com";
	private final String NOME_USUARIO = "Joao da Silva";
	private final String TELEFONE = "11940028922";
	private final String SENHA = "123465";

	@Test
	public void cadastrarUsuario() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mauricio\\Documents\\Drivers\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://www.floresonline.com.br/");
		Print.tiraPrint(driver, "URL");
		// Clicar nos bot�es necess�rios
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
		// Conclus�o para criar conta
		driver.findElement(By.id("btnMain")).click();
		Print.tiraPrint(driver, "Conclusion");
		// Sair da conta
		// driver.findElement(By.linkText("Joao")).click();
		// driver.findElement(By.linkText("SAIR")).click();

	}

	@Test
	public void fluxoCompra() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mauricio\\Documents\\Drivers\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://www.floresonline.com.br/");
		// Montar o presente
		driver.findElement(By.linkText("Monte seu presente")).click();
		Print.tiraPrint(driver, "Monte seu presente");
		// Selecionar o endereco
		driver.findElement(By.cssSelector(".forbidden-busca-endereco-fake-input")).click();
		driver.findElement(By.id("searchForbiddenInput")).sendKeys("09210630");
		Print.tiraPrint(driver, "Preenchimento do campo de cep");
		// driver.findElement(By.id("searchForbiddenInput")).click();
		driver.findElement(By.id("searchForbiddenInput")).sendKeys(Keys.ENTER);

	}
	
	@Test
	public void test() throws IOException, InvalidFormatException {
		System.out.println("teste");
		Word.transferToDoc();
	}

}
