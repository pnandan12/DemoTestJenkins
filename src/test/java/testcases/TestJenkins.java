package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.PageElement;

public class TestJenkins extends PageElement{
	public TestJenkins(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shyam\\java-selenium\\drivers\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	@Test
	public void firstname() {
		enterUserDetails(txtfirstName, "Praveen");
		enterUserDetails(txtlasttName, "kumar");
		enterUserDetails(txtEmail,"email@co.in");
	}
}
