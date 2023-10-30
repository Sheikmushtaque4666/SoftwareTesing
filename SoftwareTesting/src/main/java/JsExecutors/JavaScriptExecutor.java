package JsExecutors;

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
		driver.get("https://www.twoplugs.com/");

		//--->Flash
		WebElement joinfree=driver.findElement(By.xpath("//a[@class='btn green']"));
		//JavaScriptUtil.flashByJs(joinfree, driver);

		//--->Drawing border & take screenshot
		JavaScriptUtil.drawBorder(joinfree,driver);

		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);//capturing the screenshot
		File trg=new File(".\\Screenshots\\twoplugs.png");//location to store screenshot
		FileUtils.copyFile(src, trg);  

		//--->Capture title of the page
		//System.out.println(driver.getTitle());

		String title=JavaScriptUtil.getTitleByJs(driver);
		System.out.println("Title name:"+title);

		//--->Click action
		WebElement loginBtn= driver.findElement(By.xpath("//span[@class='help']"));
		//loginBtn.click();
		//JavaScriptUtil.clickElementByJs(loginBtn, driver);

		//--->Generate alert
		//JavaScriptUtil.generateAlertByJs(driver, "You clicked on login button...");

		//--->Refreshing the page
		//driver.navigate().refresh()
		//JavaScriptUtil.refreshBrowserByJs(driver);  

		//Scroll down the page till we found element
		//WebElement image=driver.findElement(By.xpath("//*[@id=\"rslides3_s0\"]/div[1]/img"));
		//JavaScriptUtil.scrollIntoViewByJs(image, driver);

		//--->Scroll down page till end
		JavaScriptUtil.scrollPageDownByJs(driver);

		Thread.sleep(4000);

		//--->Scroll up page till top
		JavaScriptUtil.scrollPageUpByJs(driver);  


	}

}
