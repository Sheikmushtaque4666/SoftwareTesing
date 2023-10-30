
package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");

		String year="2020";
		String month="July";
		String date="10";

		driver.findElement(By.xpath("//*[@id=\"date-box\"]")).click();

		while(true)
		{
			String montyear=driver.findElement(By.xpath("//*[@id=\"rdc-root\"]/div/div[1]/div[2]/div[2]/div/div/div[2]/div[1]")).getText();
			String arr[]=montyear.split(" ");
			String mon=arr[0];
			String yr=arr[1];

			if(mon.equalsIgnoreCase(month) && yr.equals(year)){
				break;

			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
			}

			//date selection
			List<WebElement>alldate=driver.findElements(By.xpath("//*[@id=\"rdc-root\"]/div/div[1]/div[2]/div[2]/div/div/div[2]/span/span[4]/div[5]/span"));

			for(WebElement ele:alldate) {
				String dt=ele.getText();
				if(dt.equals(date)) {
					ele.click();
					break;
				}
			}

		}

		/*	WebDriverManager.edgedriver();
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.redbus.com");
		driver.manage().window().maximize();

		String year="2025";
		String month="July";
		String date="10";

		driver.findElement(By.id("date-box")).click();

		while(true) {
			String montyear=driver.findElement(By.xpath("//div[@class=\"DayNavigator__CalendarHeader-sc-1tlckkc-1 ccLrBz\"]")).getText();
			String arr[]=montyear.split(" ");
			String mon=arr[0];
			String yr=arr[1];


	}*/

	}
}
