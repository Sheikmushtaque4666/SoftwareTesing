	package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTextVSgetAttribute {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?");
		
		//----->email
		WebElement email=driver.findElement(By.id("Email"));
		email.clear();
		email.sendKeys("admin@yourstore.com");
		
		//----->password
		WebElement password=driver.findElement(By.id("Password"));
		password.clear();
		password.sendKeys("admin");
		
		//----->capturing the text from input box
		System.out.println("Result from getattribute() method: "+email.getAttribute("value"));
		System.out.println("Result from getText() method: "+email.getText());
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[text()='Log in']"));
		System.out.println("Result from getText() method: "+ loginbutton.getText());
		
		loginbutton.click();

	}

}
