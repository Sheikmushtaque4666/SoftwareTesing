package PageObjectModel_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest1 {

	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		LoginTest lt=new LoginTest(driver);
		lt.enterusername("locked_out_user");
		lt.enterpassword("secret_sauce");
		lt.clickonlogin();
		lt.closebrowser();		
	}
}
