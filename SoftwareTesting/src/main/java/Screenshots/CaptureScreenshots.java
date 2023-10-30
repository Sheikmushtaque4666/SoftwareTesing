package Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshots {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com");

		/*	//--->Full Page ScreenShot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);//capturing the screenshot
		File trg=new File(".\\Screenshots\\homepage.png");//location to store screenshot
		FileUtils.copyFile(src, trg);  */


		/*	//--->Screenshot of Section/Portion of the Page
		WebElement section=driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]"));

		File src=section.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\Screenshots\\FeaturedProduct.png");
		FileUtils.copyFile(src, trg);  */

		//--->Screenshot of Logo
		WebElement logo=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));

		File src=logo.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\Screenshots\\Logo.png");
		FileUtils.copyFile(src, trg);
		
		
		driver.close();

	}

}
