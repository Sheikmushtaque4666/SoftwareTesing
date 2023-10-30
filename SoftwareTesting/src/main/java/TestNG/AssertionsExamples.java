package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionsExamples {

	WebDriver driver;
	
	@BeforeClass
	void setup() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(priority=1)
	void logoTest()
	{
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
		//Assert.assertTrue(logo.isDisplayed());
		Assert.assertFalse(logo.isDisplayed());

	}
	
	@Test(priority=2)
	void homePageTitle()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title,"OrangeHRM123");
	}
	
	@AfterClass
	void tearDown() 
	{
		driver.quit();
	}
}
