package SeleniumPrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		//--->Using sendKeys
		//driver.findElement(By.xpath("//input[@id=\"imagesrc\"]")).sendKeys("C:\\Users\\sheik\\Downloads\\file-sample_100kB.doc");

		Thread.sleep(3000);
		
		//--->using robot class
		WebElement button=driver.findElement(By.xpath("//div[@class=\"col-xs-6 col-xs-offset-6\"]//input[@id=\"imagesrc\"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",button);
		
		Robot rb=new Robot();
		rb.delay(2000);
		
		//--->put path to file in a clipboard
		StringSelection ss=new StringSelection("C:\\Users\\sheik\\Downloads\\file-sample_100kB.doc");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
		//--->Ctrl+v
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		//--->Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}

}

