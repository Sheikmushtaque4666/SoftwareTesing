package WebDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommands {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	     
	    WebDriver driver=new ChromeDriver();      
	 	driver.manage().window().maximize();
	 	 
	 	driver.get("https://demo.guru99.com/selenium/newtours/");
	 	System.out.println(driver.getTitle());
	 	
	 	driver.navigate().to("https://www.facebook.com/");
	 	System.out.println(driver.getTitle());

	 	
	 	driver.navigate().back();
	 	System.out.println(driver.getTitle());

	 	
	 	driver.navigate().forward();
	 	System.out.println(driver.getTitle());

	 	
	 	driver.navigate().refresh();
	 	
	 	driver.close();
	 	
	}

}
