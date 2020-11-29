package beca.helper;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print {
	
	public static void tiraPrint(WebDriver driver, String nomeEvidencia) throws IOException {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\Mauricio\\eclipse-workspace\\beca\\evidencias\\evidencia"+ nomeEvidencia + ".png"));
	}

}
