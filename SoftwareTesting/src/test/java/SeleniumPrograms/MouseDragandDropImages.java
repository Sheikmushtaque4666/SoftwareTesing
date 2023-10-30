package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseDragandDropImages {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		WebElement item1=driver.findElement(By.xpath("//li[1]"));
		WebElement item2=driver.findElement(By.xpath("//li[2]"));
		WebElement item3=driver.findElement(By.xpath("//li[3]"));


		//WebElement trash=driver.findElement(By.xpath("//div[@id='trash'])"));
		WebElement trash=driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));

		
		Actions act=new Actions(driver);
		act.dragAndDrop(item1, trash).perform();
		act.dragAndDrop(item2, trash).perform();
		act.dragAndDrop(item3, trash).perform();


		}

}
