package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageElement {
	WebDriver driver;
	
	public By txtfirstName = By.id("firstName");
	public By txtlasttName = By.id("lastName");
	public By txtEmail = By.id("userEmail");
	//@FindBy(id="firstName")
	//WebElement txtfirstName;
	
	public PageElement(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterUserDetails(By ele,String Fname) {
		driver.findElement(ele).sendKeys(Fname);
	}

}
