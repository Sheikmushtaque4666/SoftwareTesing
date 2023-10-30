package PageObjectModel_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestDemo {
	
	//without single page factory
	WebDriver driver;
	//Constructor
	TestDemo(WebDriver d){
		driver=d;
	}

	//Locators/WebElement
	//Identify user name
	By username=By.id("user-name");
	By password=By.id("password");
	By loginbtn=By.id("login-button");
	
	//Page action method
		public void enterusername(String uname) {
			driver.findElement(username).sendKeys(uname);
		}

		public void enterpassword(String pwd) {
			driver.findElement(password).sendKeys(pwd);
		}

		public void clickonlogin() {
			driver.findElement(loginbtn).click();
		}
		
		public void closebrowser() {
			driver.quit();
		}


}
