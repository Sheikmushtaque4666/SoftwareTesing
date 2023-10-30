package UploadAndDownloadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");

		driver.findElement(By.xpath("//*[@id='imagesrc']")).click();

		String imagesFilepath="C:\\Users\\sheik\\OneDrive\\Pictures\\Screenshots\\";
		String InputFilepath="C:\\Users\\sheik\\OneDrive\\Pictures\\Screenshots\\";

		Screen s=new Screen();

		Pattern fileInputTextbox=new Pattern(imagesFilepath+"fileInputTextbox.png");
		Pattern openButton=new Pattern(imagesFilepath+"openButton.png");

		Thread.sleep(5000);


		s.wait(fileInputTextbox, 20);
		s.type(fileInputTextbox,InputFilepath+"apple.jpg");
		s.click(openButton);





	}

}
