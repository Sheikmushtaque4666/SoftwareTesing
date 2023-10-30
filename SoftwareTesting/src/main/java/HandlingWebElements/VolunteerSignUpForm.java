package HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VolunteerSignUpForm {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?");

		//----->Name,City,Email & Phone
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Mushtaque");
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Hyderabad");
		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("mushtaque@3339");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("987654321");

		//---->DropDown
		WebElement drptime=driver.findElement(By.id("RESULT_RadioButton-9"));
		Select t=new Select(drptime);
		//t.selectByIndex(0); //by index
		//t.selectByValue("Radio-2"); //by value
		t.selectByVisibleText("Evening");//by visible text

		System.out.println(t.getOptions().size()); //number of items present in the drop down box

		//----->Radio button selection
		System.out.println(driver.findElement(By.id("RESULT_RadioButton-7_0")).isSelected());
		driver.findElement(By.id("RESULT_RadioButton-7_0")).click();

		//----->Check boxes selection
		driver.findElement(By.id("RESULT_CheckBox-8_0")).click();
		//driver.findElement(By.id("RESULT_CheckBox-8_6")).click();
		

		//----->Links
		driver.findElement(By.linkText("Software Testing Tutorials")).click();
		driver.navigate().back();
		driver.findElement(By.id("FSsubmit")).click();
	}

}
