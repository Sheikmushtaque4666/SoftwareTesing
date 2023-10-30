package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommands {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
	     
	     WebDriver driver=new ChromeDriver();      
	 	 driver.manage().window().maximize();
	 	 
	 	 driver.get("http://demo.automationtesting.in/Windows.html");
	 	 driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();
	 	 
	 	 //driver.close(); //close only one window at a time
	 	 
	 	 driver.quit(); //close multiple windows at a time
	}

}
