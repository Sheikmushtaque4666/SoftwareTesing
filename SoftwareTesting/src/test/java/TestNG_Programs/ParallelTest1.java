package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest1 {
	
	@Test(invocationCount=5)
	public void verifyLogin() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("Standard_user");
		Thread.sleep(3000);		

		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");

		driver.findElement(By.id("login-button"));
		driver.quit();



	}
}
