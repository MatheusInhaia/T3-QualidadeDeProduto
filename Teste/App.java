import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
	public WebDriver driver;
	
	@Before
	public void setUp() {
		//Não consegui usar com o chrome
		 WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
	}
	
	@Test
	public void test() {
		
		 driver.get("https://www.google.com.br/");
		 driver.manage().window().maximize();
	}
}
