package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsXpath {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//----->Absolute Xpath
		//driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/input")).sendKeys("T-shirts");
		
		//----->Relative Xpath
		//driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Realme");
		
		//----->Using OR operator
		//driver.findElement(By.xpath("//input[@name='search' or type='text']")).sendKeys("Samsung");
		//driver.findElement(By.xpath("//input[@name='search' or type='text1']")).sendKeys("Samsung");
		
		//----->Using AND operator
		//driver.findElement(By.xpath("//input[@name='search' and @type='text']")).sendKeys("Nokia");
		//driver.findElement(By.xpath("//input[@name='search' and @type='text1']")).sendKeys("Vivo");
		
		//----->Using contains ()
		//driver.findElement(By.xpath("//input[contains(@name,'search')]")).sendKeys("Oppo");
		
		//----->Using with starts-with
		//driver.findElement(By.xpath("//input[starts-with(@class,'form-control')]")).sendKeys("Iphone");
		
		//----->Using with text
		driver.findElement(By.xpath("//a[text()='Desktops']")).click();

		

		
		

		
		
		

		


		
		


 
		
		
		
		
		
		
	}

}
