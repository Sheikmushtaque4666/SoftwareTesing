package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseDoubleClickAction {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onclick_copy");

		driver.switchTo().frame("iframeResult");

		WebElement field1=driver.findElement(By.xpath("//input[@id=\"field1\"]"));
		field1.clear();
		field1.sendKeys("Welcome to Selenium");
		
		WebElement button=driver.findElement(By.xpath("//button[text()='Copy']"));
		
		Actions act=new Actions(driver);
		act.doubleClick(button).perform();
		


	}

}
