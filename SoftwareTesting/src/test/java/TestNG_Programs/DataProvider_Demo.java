package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_Demo {

	@Test(dataProvider="SearchDataSet")
	public void TestCaseGoogleSearch(String country, String moumnet) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys(country+" "+moumnet);
		driver.findElement(By.name("btnk")).submit();
		searchbox.sendKeys(Keys.ENTER);
		driver.quit();
	}

	@DataProvider(name="SearchDataSet")
	public Object[][] searchData(){
		Object[][] searchKeyword=new Object[3][2];
		searchKeyword[0][0]="India";
		searchKeyword[0][1]="Qutub Minar";

		searchKeyword[1][0]="Agra";
		searchKeyword[1][1]="Taj Mahal";

		searchKeyword[2][0]="Hyderabad";
		searchKeyword[2][1]="Charminar";

		return searchKeyword;

	}
}


