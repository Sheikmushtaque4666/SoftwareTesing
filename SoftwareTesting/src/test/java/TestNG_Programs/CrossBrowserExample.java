package TestNG_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserExample {

	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void LaunchBrowser(String browser) {

		switch(browser.toLowerCase()) {

		case "msedge":WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();break;

		case "chrome":WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();break;

		default:driver=null;break;
		}

	}
	@Test
	public void VerifyTitle() {
		driver.get("http://google.com/");
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle,actualTitle);
	}
	
	@AfterMethod
	public void quiteBrowser() {
		driver.quit();
	}
	
	
}
