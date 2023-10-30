package SeleniumPrograms;

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

public class JavaScriptExecutor {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");

	/*	//--->Drawing border & take screenshot
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		JavaScriptUtil.drawBorder(logo,driver);

		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);//capturing the screenshot
		File trg=new File(".\\Screenshots\\borderlogo.png");//location to store screenshot
		FileUtils.copyFile(src, trg);  

		//--->Getting title of the page
		String title=JavaScriptUtil.getTitleByJs(driver);
		System.out.println("Title name:"+title);

		//--->Click action
		WebElement reglink= driver.findElement(By.xpath("//a[text()='Register']"));
		JavaScriptUtil.clickElementByJs(reglink, driver);

		//--->Generate alert
		JavaScriptUtil.genrateAlertByJs(driver, "This is my Alert...");

		//--->Refreshing the page
		JavaScriptUtil.refreshBrowserByJs(driver);  
		
		//--->Scrolling down page
		JavaScriptUtil.scrollPageDownByJs(driver);
		
		Thread.sleep(4000);
		
		//--->Scrolling up page
		JavaScriptUtil.scrollPageUpByJs(driver);  
		
		//--->Zoom page
		JavaScriptUtil.zoomPageByJs(driver);   */
		
		//--->Flash
		WebElement flash=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		JavaScriptUtil.flashByJs(flash, driver);

		
	}

}
