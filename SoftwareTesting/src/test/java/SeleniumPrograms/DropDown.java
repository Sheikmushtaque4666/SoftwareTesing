package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//----->selecting option from dropdown with using method
		WebElement drop_skill=driver.findElement(By.xpath("//select[@id='Skills']"));
		Select sc = new Select(drop_skill);
		//sc.selectByVisibleText("Java");
		//sc.selectByValue("XML");
		//sc.selectByIndex(5);
		
		//----->selecting option from drop down without using method
		List<WebElement> alloption=sc.getOptions();
		
		for(WebElement option:alloption) {
			if(option.getText().equals("Analytics")) {	
				option.click();
				break;
			}
		}
		

	}

}
