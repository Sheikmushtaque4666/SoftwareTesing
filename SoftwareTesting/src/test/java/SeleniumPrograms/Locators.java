package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		
		//Launch Browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();//maximize browser

		//Open URL
		driver.get("https://www.facebook.com/");
		
		//----->Id
		//driver.findElement(By.id("email")).sendKeys("kanna@gmail.com");
		
		//----->name
		//driver.findElement(By.name("email")).sendKeys("Mushtaque");
		
		//----->className
		//driver.findElement(By.className("inputtext")).sendKeys("Kanna");
		
		//----->tagName
		int link=driver.findElements(By.tagName("a")).size();
		System.out.println(link);
		
		//----->linkText
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//----->partialLinkText
		//driver.findElement(By.partialLinkText("Forgotten")).click();	
		
		//driver.close();
		
	}

}
