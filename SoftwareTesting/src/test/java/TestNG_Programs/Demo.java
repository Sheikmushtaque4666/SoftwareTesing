package TestNG_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	WebDriver driver;

	@Test(priority=0)
	void openbrowser() {
		System.out.println("This is my openbrowser");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

	@Test(priority=1)
	void openurl() {
		System.out.println("This is my openurl");
		driver.get("https://www.nopcommerce.com/en/demo");


	}

	@Test(priority=2)
	void maximizewindow() {
		System.out.println("This is my maximizewindow");
		driver.manage().window().maximize();


	}

	@Test(priority=3)
	void teardown() {
		System.out.println("This is my teardown");
		driver.close();

	}
}
