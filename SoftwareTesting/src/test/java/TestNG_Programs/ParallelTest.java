package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	
	@Test
	public void verifyTitle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		String exceptedTitle="Swag Labs";
		String actualTitle=driver.getTitle();

		Assert.assertEquals(actualTitle,exceptedTitle);

		Thread.sleep(3000);

		driver.quit();

	}
		@Test
		public void verifyLogo() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			
			WebElement logo=driver.findElement(By.xpath("//div[@class=\"login_logo\"]"));
			Assert.assertTrue(logo.isDisplayed());
			
			driver.quit();
		}
}
