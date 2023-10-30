package SeleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardAction2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement input1=driver.findElement(By.xpath("//textarea[@name=\"text1\"]])"));
		WebElement input2=driver.findElement(By.xpath("//textarea[@name=\"text2\"]])"));
		
		input1.sendKeys("Welcome to Selenium");
		Actions act=new Actions(driver);

		//CTRL+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();

		//CTRL+C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();

		//SHIFT+TAB
		act.sendKeys("keys.TAB");
		act.perform();

		//CTRL+V
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();

		//Compare texts
		if(input1.getAttribute("value").equals(input2.getAttribute("value")))
		{
			System.out.println("Text is copied");
		}
		else
		{
			System.out.println("Text is not copied");
		}


	}

}
