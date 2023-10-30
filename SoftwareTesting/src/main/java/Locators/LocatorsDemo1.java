package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LocatorsDemo1 {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.pl/index.php?");
		
		
		
		//----->id & name
		
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirt"); //statement1
		WebElement searchbox=driver.findElement(By.id("search_query_top"));//statement2
		searchbox.sendKeys("T-shirt");
		
		driver.findElement(By.name("submit_search")).click();
		
		//----->linkText & partial linkText
		
		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		driver.findElement(By.partialLinkText("Chiffon Dress")).click();
	
	}

}
