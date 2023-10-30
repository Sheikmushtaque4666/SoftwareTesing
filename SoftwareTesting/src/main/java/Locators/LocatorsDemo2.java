package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.pl/index.php?");
		
		//----->className
		driver.findElements(By.className("homeslider-container")).size(); //statement1
		
		int sliders=driver.findElements(By.className("homeslider-container")).size(); //statement 2
		System.out.println(sliders);
		
		//----->tagName
		driver.findElements(By.tagName("a")).size();//statement 1
		
		int links=driver.findElements(By.className("a")).size(); //statement 2
		System.out.println(links);
	}

}
