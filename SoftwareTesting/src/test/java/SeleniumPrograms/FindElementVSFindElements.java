package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVSFindElements {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register?");
		
		/*//FindElement()--->Return the single WebElement
		
		//1.Single WebElemnet Present
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchbox.sendKeys("XYZ");
		 
		//2.Multiple WebElemnet Present
		WebElement ele=driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(ele.getText());
		
		//3.No WebElemnet Present
		WebElement searchbutton=driver.findElement(By.xpath("//button[text='Login']"));*/
		
		
		//FindElements()--->Return the Multiple WebElement
		
		//1.Single WebElemnet Present
		List<WebElement> img=driver.findElements(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		System.out.println("Number of image : " +img.size());//1
				 
		//2.Multiple WebElemnet Present
		List<WebElement> link=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("Number of elements captured : "+link.size());//22
		
		for(WebElement ele:link) {
			System.out.println(ele.getText());
		}
		
		//3.No WebElemnet Present
		//List<WebElement> searchbutton=driver.findElements(By.xpath("//button[text='Login']"));
		
		List<WebElement> imge=driver.findElements(By.xpath("//img[contains(title,'elctronic')]"));
		System.out.println(imge.size()); 

	}

}
