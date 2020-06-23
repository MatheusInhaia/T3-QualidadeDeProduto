import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TesteLogin {

	public WebDriver driver;
	
	
	@Before
	public void setUp() {
		 WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
	}
	
	@Test
	public void test() throws InterruptedException {
		
		 driver.get("http://automationpractice.com/index.php");
		 driver.manage().window().maximize();
		 WebElement singIn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		 singIn.click();
		 
		 WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		 WebElement senha = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		 WebElement entrar = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]"));
		 
		 email.sendKeys("Matheus@Pucrs.br");
		 senha.sendKeys("123456");
		 entrar.click();
		 
		 WebElement welcomeAccount = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
		 assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", welcomeAccount.getText());
		 
		 
	}
	
	@After
	public void close() {
		driver.quit();
	}
}
