package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalCommands {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	     
	    WebDriver driver=new ChromeDriver();      
	 	driver.manage().window().maximize();
	 	driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB&display=page");
	 	
	 	WebElement email=driver.findElement(By.xpath("//input[@name='firstname']"));
	 	WebElement pass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	 	
	 	if(email.isDisplayed() && email.isEnabled())
	 	{
	 		email.sendKeys("mushtaque");
	 	}
	 	if(pass.isDisplayed() && pass.isEnabled())
	 	{
	 		pass.sendKeys("mushtaque123");
	 	}
	 	
	 	//female
	 	System.out.println(driver.findElement(By.xpath("//input[@id='u_0_4_ce']")).isSelected());
	 	
	 	//male
	 	System.out.println(driver.findElement(By.xpath("//input[@id='u_0_5_01']")).isSelected());
	 	
	 	//select female radio 
	 	if(driver.findElement(By.xpath("//input[@id='u_0_4_ce']")).isSelected())
	 	{
	 		driver.findElement(By.xpath("//input[@id='u_0_4_ce']")).click();
	 	}


	}

}
