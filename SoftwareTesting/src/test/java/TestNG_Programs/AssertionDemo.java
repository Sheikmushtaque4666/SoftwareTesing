package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionDemo {

	@Test
	public void TestMethod()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		System.out.println("Verify title  of the webpage");
		
		String expectedTitle="Automation Testing Practice1";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle,actualTitle);

		System.out.println("Verify the presence of wikipedia icon on web page");
		WebElement icon=driver.findElement(By.className("wikipedia-icon"));
		//Hard Assert
		Assert.assertTrue(icon.isDisplayed());

		System.out.println("Verify the presence of wikipedia search button on web page");
		WebElement seachbutton=driver.findElement(By.className("wikipedia-search-button"));
		//Hard Assert
		Assert.assertTrue(seachbutton.isDisplayed());
		
		driver.close();
	}
}
