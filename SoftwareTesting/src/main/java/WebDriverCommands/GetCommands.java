package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCommands {

	public static void main(String[] args) {
		
	     WebDriverManager.chromedriver().setup();
	     
	     WebDriver driver=new ChromeDriver();      
	 	 driver.manage().window().maximize();
	 	 
	 	 //--->get()
	 	driver.get("https://demo.guru99.com/selenium/newtours/"); //open URL in the browser
	 	//getTitle()
	 	System.out.println(driver.getTitle()); //returns title of the page
	 	//getCurrentUrl
	 	System.out.println(driver.getCurrentUrl()); //returns the URL of the page
	 	//getText
	 	String text=driver.findElement(By.xpath("//b[contains(text(),'Jul 6, 2017')]")).getText(); //return text value of an element
	 	System.out.println(text);
	 	
	 	//driver.close(); //close the current window	
	 	driver.quit(); //closes multiple windows
	 	
		
		

	}

}
