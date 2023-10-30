package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleBrowser {

	public static void main(String[] args) {
		
		//Chrome Browser
		/*WebDriverManager.chromedriver().setup();
		WebDriver chrodriver=new ChromeDriver();
		chrodriver.get("https://www.google.com/");
		
		//Firefox Browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver firfoxdriver=new FirefoxDriver();
		firfoxdriver.get("https://www.google.com/");*/
		
		//Edge Browser
		WebDriverManager.edgedriver().setup();
		WebDriver edgedriver=new EdgeDriver();
		edgedriver.get("https://www.google.com/");



	}

}
