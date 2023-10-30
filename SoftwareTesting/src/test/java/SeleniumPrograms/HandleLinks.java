package SeleniumPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.linkText("Mobiles")).click();
		//driver.findElement(By.partialLinkText("Cards")).click();

		//How to capture all the Link
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println(link.size());

		//Normal for loop
		for(int i=0;i<=link.size();i++)
		{
			System.out.println(link.get(i).getText());
			System.out.println(link.get(i).getAttribute("href"));

		}


	}

}
