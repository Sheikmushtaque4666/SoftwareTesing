package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfWebElement {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register?");
		
		//----->isDisplayed ,isEnabled()
		WebElement searchstore=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Displayed status :"+searchstore.isDisplayed());
		System.out.println("Enabled status:"+searchstore.isEnabled());
		
		//----->isSelected
		WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println(male.isSelected());//false
		System.out.println(female.isSelected());//false
		
		male.click();//Selects male radio button
		System.out.println(male.isSelected());//true
		System.out.println(female.isSelected());//false
		
		female.click();
		System.out.println(male.isSelected());//false
		System.out.println(female.isSelected());//true
		
	}

}
