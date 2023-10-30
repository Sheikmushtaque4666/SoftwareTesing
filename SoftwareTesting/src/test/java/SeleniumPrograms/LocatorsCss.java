package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsCss {

	public static void main(String[] args) {
	
	//Launch Browser
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();//Invoke the browser
	driver.manage().window().maximize();//maximize browser

	//Open URL in the browser
	driver.get("https://www.facebook.com/");
	
	//----->cssSelector Tag & id or #id
	//driver.findElement(By.cssSelector("input#email")).sendKeys("Mushtaque@gmail.com");
	//driver.findElement(By.cssSelector("#email")).sendKeys("Mushtaque@gmail.com");
	
	//----->cssSelector Tag & class or .class
	//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Mushtaque@gmail.com");
	//driver.findElement(By.cssSelector(".inputtext")).sendKeys("Mushtaque@gmail.com");
	
	//----->cssSelector Tag & attribute or [attribute]
	//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Mushtaque@gmail.com");
	//driver.findElement(By.cssSelector("[data-testid='royal_email']")).sendKeys("Mushtaque@gmail.com");
	
	//----->cssSelector Tag, class & attribute or [attribute=value]
	//driver.findElement(By.cssSelector("input.inputtext[name='email']")).sendKeys("Mushtaque@gmail.com");
	//driver.findElement(By.cssSelector("input.inputtext[name='pass']")).sendKeys("Mushtaque786");
	
	//----->cssSelector Tag, id & attribute or [attribute=value]
	driver.findElement(By.cssSelector("input#email[name='email']")).sendKeys("Mushtaque@gmail.com");
	driver.findElement(By.cssSelector("input#pass[name='pass']")).sendKeys("Mushtaque786");
		
	driver.close();
	}

}
