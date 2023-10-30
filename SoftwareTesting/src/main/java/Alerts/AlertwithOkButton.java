package Alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertwithOkButton {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Alerts.html");

		//---->Alert box with OK button example

		//Alert with OK link
		driver.findElement(By.xpath("//a[@class='analystic']")).click();

		//Alert with OK button
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();

		//Switch to alert box
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); //Ok button clicked and close the alert


	}

}
