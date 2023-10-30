package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo3_CssSelectors {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//----->Tag & ID
		
		//driver.findElement(By.cssSelector("input#email")).sendKeys("Kanna");
		//driver.findElement(By.cssSelector("#email")).sendKeys("chinna");
		
		//----->Tag & Class
		
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Mushtaque");
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("Sheik");
		
		//----->Tag & Attribute
		
		//driver.findElement(By.cssSelector("input[name=email]")).sendKeys("Munna");
		//driver.findElement(By.cssSelector("[name=email]")).sendKeys("Chinna");
		
		//----->Tag, Class & Attribute
		
		driver.findElement(By.cssSelector("input.inputtext[data-testid='royal_email']")).sendKeys("Mushtaque@gmail.com");
		driver.findElement(By.cssSelector("input.inputtext[data-testid='royal_pass']")).sendKeys("Mushtaque123");

	}

}
