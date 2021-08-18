package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class jenkinsTest {
static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shyam\\java-selenium\\drivers\\chromedriver_win32\\chromedriver.exe");	
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/automation-practice-form");

	 driver.findElement(By.id("firstName")).sendKeys("Praveen");
	 driver.findElement(By.id("lastName")).sendKeys("kumar");;
	 driver.findElement(By.id("userEmail")).sendKeys("Praveen@kumar.com");;
		
			
		
	
			driver.quit();
		
		

	}
	

}
