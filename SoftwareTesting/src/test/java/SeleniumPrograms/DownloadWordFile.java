package SeleniumPrograms;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadWordFile {

	public static void main(String[] args) {

		String location=System.getProperty("user.dir")+"\\Downloads\\";

		//Chrome
		HashMap preferences=new HashMap();
		preferences.put("download.default_directory", location);
		preferences.put("plugins.always_open_pdf_externally", true);//for pdf download

		ChromeOptions option=new ChromeOptions();
		option.setExperimentalOption("prefs", preferences);

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(option);  

		/*	//Edge
		HashMap preferences=new HashMap();
		preferences.put("download.default_directory", location);
		preferences.put("plugins.always_open_pdf_externally", true);//for pdf download

		EdgeOptions option=new EdgeOptions();
		option.setExperimentalOption("prefs", preferences);

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver(option);  */

		driver.manage().window().maximize();
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		//driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");

		driver.findElement(By.xpath("//tbody//tr[1]/td[5]/a")).click();

	}

}
