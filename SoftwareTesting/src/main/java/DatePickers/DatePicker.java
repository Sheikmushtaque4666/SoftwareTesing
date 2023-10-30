package DatePickers;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");

		String year="2025";
		String month="July";
		String date="10";

		driver.findElement(By.id("date-box")).click();

		while(true)
		{
			String monthyear=driver.findElement(By.xpath("//div[@class=\"DayNavigator__CalendarHeader-sc-1tlckkc-1 ccLrBz\"]")).getText();
			String arr[]=monthyear.split(" ");
			String mon=arr[0];
			String yr=arr[1];

			if(mon.equalsIgnoreCase(month) && yr.equals(year)){
				break;

			}
			else
			{
				driver.findElement(By.xpath("//div[@id=\"next\"]")).click();
			}


			//date selection
			List<WebElement>alldate=driver.findElements(By.xpath("//div[@class=\"DayTiles__CalendarDaysBlock-sc-14em0t0-0 eUrtce\"]/span"));
			for(WebElement ele:alldate) {
				String dt=ele.getText();
				if(dt.equals(date)) {
					ele.click();
					break;
				}
			}

		}


	}

}
