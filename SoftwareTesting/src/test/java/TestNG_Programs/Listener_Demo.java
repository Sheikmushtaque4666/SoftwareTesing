package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(TestNG_Programs.ListenersClass.class)

public class Listener_Demo {

	@Test
	public void verifyLogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?");

		WebElement username=driver.findElement(By.id("Email"));
		username.clear();
		username.sendKeys("admin@yourstore.com");

		WebElement password=driver.findElement(By.id("Password"));
		password.clear();
		password.sendKeys("admin");

		driver.findElement(By.xpath("//button[text()='Log in']")).click();

		//Verify title of dashboard by using assertion
		Assert.assertEquals(driver.getTitle(),"Dashboard / nopCommerce administration");

		driver.quit();


	} 
	@Test
	public void testFail() {
		System.out.println("Test case Fail");
		Assert.assertTrue(false);
	}
	@Test
	public void testPass() {
		System.out.println("Test case Pass");
		Assert.assertTrue(true);

	}
	@Test
	public void testSkipped() {
		System.out.println("Test case Skipped");
		throw new SkipException("skip on Excution....");

	}
}

