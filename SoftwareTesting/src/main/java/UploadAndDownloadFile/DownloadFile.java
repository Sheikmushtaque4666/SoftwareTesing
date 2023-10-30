package UploadAndDownloadFile;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile {

	public static void main(String[] args) {
		String location=System.getProperty("user.dir")+"\\Downloads\\";

		//Chrome
		HashMap preferences=new HashMap();
		preferences.put("download.default_directory", location);

		ChromeOptions option=new ChromeOptions();
		option.setExperimentalOption("prefs", preferences);

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(option);

		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileDownload.html");

		//Download Text File
		driver.findElement(By.id("textbox")).sendKeys("testing txt file download");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();


		//Download pdf File
		driver.findElement(By.id("pdfbox")).sendKeys("testing pdf download");
		driver.findElement(By.id("createPdf")).click();
		driver.findElement(By.id("pdf-link-to-download")).click();


	}

}
