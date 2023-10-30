package PageObjectModel_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin {

	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		TestDemo td=new TestDemo(driver);
		td.enterusername("locked_out_user");
		td.enterpassword("secret_sauce");
		td.clickonlogin();
		td.closebrowser();		
	}

}


