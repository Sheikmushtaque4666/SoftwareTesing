package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo4_XPaths {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.pl/index.php?");
		
		//----->Absolute Xpath
		
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();

		//----->Relative Xpath
		
		//driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
		
		//----->Xpath with 'or'
		
		//driver.findElement(By.xpath("//input[@id='search_query_top' or @name='search_query1']")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//button[@name='submit_search1' or @class='btn btn-default button-search']")).click();
		
		//----->Xpath with 'and'
		
		//driver.findElement(By.xpath("//input[@id='search_query_top' and @name='search_query']")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//button[@name='submit_search' and @class='btn btn-default button-search']")).click();
		
		//----->Xpath with contains()
		
		//driver.findElement(By.xpath("//input[contains(@id,'query_top')]")).sendKeys("T-shirts"); //id=search_query_top
		//driver.findElement(By.xpath("//button[contains(@name,'search')]")).click(); //name=submit_search
		
		//----->Xpath with starts-with()
		
		//driver.findElement(By.xpath("//input[starts-with(@id,'search_query')]")).sendKeys("T-shirts"); //id=search_query_top
		//driver.findElement(By.xpath("//button[starts-with(@name,'submit_')]")).click(); //name=submit_search
		
		//----->Xpath with text()
		
		//driver.findElement(By.xpath("//a[text()='Women']")).click(); //Women Tab
		
		//----->Xpath with chained xpath
		driver.findElement(By.xpath("//form[@id='searchbox']//input[@id='search_query_top']")).sendKeys("T-shirts");
		driver.findElement(By.xpath("//form[@id='searchbox']//button[@name='submit_search']")).click();
		



		


		
	}

}
