package DatePickers;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");

		driver.findElement(By.xpath("//input[@id=\"dob\"]")).click();

		Select drop_month=new Select (driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		drop_month.selectByVisibleText("Oct");

		Select drop_year=new Select (driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		drop_year.selectByVisibleText("2020");

		String date="10";

		List<WebElement>alldate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

		for(WebElement ele:alldate) {
			String dt=ele.getText();
			if(dt.equals(date)) {
				ele.click();
				break;
			}
		}
	}

}
