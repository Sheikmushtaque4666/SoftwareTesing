package SeleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		//--->ExplicitWait(Approach1)
		//WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));

		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

		/*WebElement element=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='WebDriver']")));
		element.click();*/
		
		
		By elelocator=By.xpath("//a[text()='WebDriver']");
		waitforElementPresent(driver,elelocator,10).click();
		
		By download=By.xpath("//ul[@class=\"navbar-nav mr-4 mb-2 mb-lg-0 ps-4 ps-lg-2\"]//span[text()='Downloads']");
		waitforElementPresent(driver,download,10).click();

	}
	
	
	//Approach2
	public static WebElement waitforElementPresent(WebDriver driver,By locator,int timeout) 
	{
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return driver.findElement(locator);
	}

}

