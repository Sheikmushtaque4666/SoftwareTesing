package SeleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrame {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://nxtgenaiacademy.com/iframe/");

		//Frame1
		driver.switchTo().frame("homepage");
		//driver.switchTo().frame(0);
		WebElement homepage=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[1]/button"));
		homepage.click();
		driver.switchTo().defaultContent();//go back into main page

		
		//Frame2
		driver.switchTo().frame("popuppage");
		//driver.switchTo().frame(1);
		WebElement popuppage=driver.findElement(By.xpath("//button[text()='Alert Box']"));
		popuppage.click();
		
	   Alert alert=driver.switchTo().alert();
	   alert.accept();

	}

}
