package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
		 driver.findElement(By.id("firstName")).sendKeys("Praveen");
		 driver.findElement(By.id("lastName")).sendKeys("kumar");
		 driver.findElement(By.id("userEmail")).sendKeys("Praveen@kumar.com");
  }
  @BeforeTest
public void setUp() {
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shyam\\java-selenium\\drivers\\chromedriver_win32\\chromedriver.exe");	
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/automation-practice-form");
  }

  @AfterTest
  public void teardown() {
		driver.quit();
	}

}
