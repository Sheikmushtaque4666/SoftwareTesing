package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");

		//How many rows in table
		int rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		System.out.println("Total number of rows in a table:"+rows);

		//How many columns in table
		int columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
		System.out.println("Total number of columns in a table:"+columns);

		//Retrieve all the data from the table
		System.out.println("Data from the Table...........");
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=columns;j++) {
				System.out.println(driver.findElement(By.xpath("//table[@id='customers']")).getText()+" ");
				//System.out.print(driver.findElement(By.xpath("html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText()+" ");
				//System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td["+j+"]")).getText());

			}
			System.out.println();
		}

	}

}
