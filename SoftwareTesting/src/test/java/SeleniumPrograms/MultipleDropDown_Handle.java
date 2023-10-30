package SeleniumPrograms;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropDown_Handle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		/*//Approach 1
		 
		//--->Select Skills
		Select skill=new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		skill.selectByVisibleText("Java");
		
		//--->Select Country
		Select select_Country=new Select(driver.findElement(By.xpath("//select[@id='country']")));
		select_Country.selectByVisibleText("India");
		
		//--->Select Year
		Select year=new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
		year.selectByVisibleText("1919");
		
		//--->Select Month
		Select month=new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		month.selectByVisibleText("June");
		
		//--->Select Day
		Select day=new Select(driver.findElement(By.xpath("//select[@id='daybox']")));
		day.selectByVisibleText("10");*/
		
		//Approach 2
		
		//--->Select Skills
		WebElement skill=driver.findElement(By.xpath("//select[@id='Skills']"));
		selectOptionFromDroDown(skill, "Java");
		
		//--->Select Country
		WebElement select_Country=driver.findElement(By.xpath("//select[@id='country']"));
		selectOptionFromDroDown(select_Country, "India");
		
		//--->Select Year
		WebElement year=driver.findElement(By.xpath("//select[@id='yearbox']"));
		selectOptionFromDroDown(year, "2000");
		
		//--->Select Month
		WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		selectOptionFromDroDown(month,"June");
		
		//--->Select Day
		WebElement day=driver.findElement(By.xpath("//select[@id='daybox']"));
		selectOptionFromDroDown(day, "5");
	}
	
	public static void selectOptionFromDroDown(WebElement ele,String value) {
			Select drop=new Select(ele);
			List<WebElement> alloption=drop.getOptions();

			for(WebElement option:alloption) {
				if(option.getText().equals(value)) {	
					option.click();
					break;
				}
			}
	
	
	}
}
