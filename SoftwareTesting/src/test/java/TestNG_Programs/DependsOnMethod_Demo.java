package TestNG_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependsOnMethod_Demo {

	@Test(dependsOnMethods= {"alaunch"})
	public void LoginPage() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();

	}
	@Test 
	public void alaunch() {
		WebDriverManager.chromedriver().setup();

	}
}
