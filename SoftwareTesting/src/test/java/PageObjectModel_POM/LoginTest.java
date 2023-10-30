package PageObjectModel_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {

	WebDriver driver;

	//Using Page Factory
	//Constructor
	LoginTest(WebDriver d){
		driver=d;
		PageFactory.initElements(driver,this);
	}

	//Locators/WebElement
	//Identify user name
	@FindBy(id="user-name")
	WebElement username;

	//Identify password
	@FindBy(id="password")
	WebElement password;

	//Identify login button
	@FindBy(id="login-button")
	WebElement loginbtn;

	//Page action method
	public void enterusername(String uname) {
		username.sendKeys(uname);
	}

	public void enterpassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickonlogin() {
		loginbtn.click();
	}
	
	public void closebrowser() {
		driver.quit();
	}


}
