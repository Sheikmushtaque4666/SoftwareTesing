package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionDemo1 {

	@Test
	public void testMethod()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		SoftAssert softverify=new SoftAssert();

		System.out.println("Verify title  of the webpage");

		String expectedTitle="Automation Testing Practice";
		String actualTitle=driver.getTitle();
		softverify.assertEquals(expectedTitle,actualTitle);

		System.out.println("Verify the presence of wikipedia icon on web page");
		WebElement icon=driver.findElement(By.className("wikipedia-icon"));
		//Hard Assert
		softverify.assertTrue(icon.isDisplayed());

		System.out.println("Verify the presence of wikipedia search button on web page");
		WebElement seachbutton=driver.findElement(By.id("wikipedia-icon"));
		//Hard Assert
		softverify.assertTrue(seachbutton.isDisplayed());

		driver.close();
		//Report all failure message
		softverify.assertAll();
	}
}
