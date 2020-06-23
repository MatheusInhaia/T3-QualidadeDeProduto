import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TesteCalculadora {
	public WebDriver driver;
	
	
	@Before
	public void setUp() {
		//Não consegui usar com o chrome
		 WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
	}
	
	@Test
	public void test() throws InterruptedException {
		
		 driver.get("https://www.calculadora-online.xyz/");
		 driver.manage().window().maximize();
		 WebElement botaoCinco = driver.findElement(By.xpath("//*[@id=\"cinq\"]"));
		 WebElement botaoVezes = driver.findElement(By.xpath("//*[@id=\"multiplier\"]"));
		 WebElement botaoIgual = driver.findElement(By.xpath("//*[@id=\"egale\"]"));
		 WebElement resultado = driver.findElement(By.xpath("//*[@id=\"total\"]"));
		 
		 botaoCinco.click();
		 
		 botaoVezes.click();
		 
		 botaoCinco.click();
		 
		 botaoIgual.click();
		
		 assertEquals(resultado.getText(),"25");
		 
	}
	
	@After
	public void close() {
		driver.quit();
	}
}
