package test;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class ejemplo {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
	 
	//WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("start-maximized");
	driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
	driver.get("https://www.google.com.ar/");
	}
	
	@Test
	public void main() {

			driver.findElement(By.id("L2AGLb")).click();
		} 
	
	@AfterTest
	public void CerrarNavegador() {
		//driver.quit();
	}

}


