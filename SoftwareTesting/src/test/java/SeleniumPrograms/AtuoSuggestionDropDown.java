package SeleniumPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AtuoSuggestionDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("java tutorial");
		Thread.sleep(3000);

		List<WebElement>list=driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]//span"));
		System.out.println("Size of Auto Suggestions:" +list.size());

		for(WebElement listitem:list)
		{
			if(listitem.getText().contains("oracle")) {
				listitem.click();
				break;
			}
		}
	}

}
