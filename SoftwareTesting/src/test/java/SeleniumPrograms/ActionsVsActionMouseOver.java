package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsVsActionMouseOver {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com");
		
		WebElement features=driver.findElement(By.xpath("//a[text()='Desktops']"));
		
		Actions act=new Actions(driver);
		//act.moveToElement(features).perform();
		
		Action action=act.moveToElement(features).build();
		action.perform();
		
		
		
	

	}

}
