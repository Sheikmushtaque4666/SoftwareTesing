package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SizeAndLocationOfElement {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com");
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		//Location Method1
		System.out.println("Location(X,Y):"+logo.getLocation()); //(141, 80)
		System.out.println("Location(X):"+logo.getLocation().getX());//141
		System.out.println("Location(Y):"+logo.getLocation().getY());//80
		
		//Location Method2
		System.out.println("Location(X):"+logo.getRect().getX());//141
		System.out.println("Location(Y):"+logo.getRect().getY());//80
		
		//Size-Method1
		System.out.println("Size(Width,Height):"+logo.getSize()); //(250, 50)
		System.out.println("Size(Width):"+logo.getSize().getWidth());//250
		System.out.println("Size(Height):"+logo.getSize().getHeight());//50
		
		//Size-Method2
		System.out.println("Size(Width):"+logo.getRect().getWidth());//250
		System.out.println("Size(Height):"+logo.getRect().getHeight());//50
		
	}

}
