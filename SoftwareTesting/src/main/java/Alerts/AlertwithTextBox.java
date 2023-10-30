package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertwithTextBox {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		//1st Click
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		
		driver.switchTo().alert().sendKeys("Testing");
		driver.switchTo().alert().accept();
		
		String ExpString="Hello Automation Testing user How are you today";
		
		String ActString=driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
		
		if(ExpString.equals(ActString)==true)
		{
			System.out.println("test is passed");
		}
		
	}

}
