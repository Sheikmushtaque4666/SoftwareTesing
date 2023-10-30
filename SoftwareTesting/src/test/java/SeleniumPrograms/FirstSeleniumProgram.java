package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumProgram {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome","\"C:\\Users\\sheik\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe\"");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");

	}

}
