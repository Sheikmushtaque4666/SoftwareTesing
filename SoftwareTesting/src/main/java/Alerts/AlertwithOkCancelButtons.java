package Alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertwithOkCancelButtons {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Alerts.html");

		//Alert with OK CANCEL link
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();

		//Alert with OK CANCEL button
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();

		String ExpTextOK="You pressed Ok";
		driver.switchTo().alert().accept();

		String ActText=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();

		if(ExpTextOK.equals(ActText)==true)
		{
			System.out.println("test is passed");
		}

		//Alert with OK CANCEL button
		driver.findElement(By.xpath("//*[@id=\\\"CancelTab\\\"]/button]")).click();

		String ExpTextCancel="You Pressed Cancel";
		driver.switchTo().alert().dismiss();

		ActText=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();

		if(ExpTextCancel.equals(ActText)==true)
		{
			System.out.println("test is passed");

		}

	}

}
