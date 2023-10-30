package SeleniumPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Register.html");

		//selecting specific check box
		driver.findElement(By.id("checkbox1")).click();

		//--->select all the check boxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'checkbox')]"));
		System.out.println("Total number of checkBoxes:"+checkboxes.size());

		/*for(WebElement chkbox:checkboxes)
		{
			chkbox.click();
		}*/

		//--->selecting multiple check boxes by choice
		for(WebElement chkbox:checkboxes)
		{
			String chkboxname=chkbox.getAttribute("id");

			if(chkboxname.equals(" Cricket ")|| chkboxname.equals(" Hockey "))
			{
				chkbox.click();
			}
		}


	}

}
