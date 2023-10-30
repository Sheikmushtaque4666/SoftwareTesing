package Windows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingWindows {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Windows.html");

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();

		//System.out.println(driver.getTitle());

		Set <String> s=driver.getWindowHandles();

		for(String i:s)
		{
			String t=driver.switchTo().window(i).getTitle(); //This loop returns the title of the both the browsers
			//System.out.println(t);
			
			/*if(t.contains("Frames & windows"))  //close the parent window
			{
				driver.close();
			}*/
			
			if(t.contains("Selenium"))  //close the child window
			{
				driver.close();
			}
		}

	}

}
