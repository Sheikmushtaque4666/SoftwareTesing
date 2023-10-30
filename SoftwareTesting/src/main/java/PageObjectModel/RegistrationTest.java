package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationTest {

	@Test
	public  void verifyFlightReg() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demo.guru99.com/test/newtours/");

		//RegistrationPage RGPage=new RegistrationPage(driver);
		RegistrationPage2 RGPage=new RegistrationPage2(driver);


		RGPage.clickRegLink();
		RGPage.setFirstName("Kanna");
		RGPage.setLastName("ssv");
		RGPage.setPhone("8080808080");
		RGPage.setemail("kanna@mail.com");
		RGPage.setAddress1("Shapur");
		//RGPage.setAddress2("Jedimetla");
		RGPage.setCity("Hyderbad");
		RGPage.setState("Telangana");
		RGPage.setPostalCode("500055");

		RGPage.setCountry("India");

		RGPage.setUserName("KANNA");
		RGPage.setPassword("kanna");

		RGPage.clickRegBtn();

		//Validation
		if(driver.getPageSource().contains("Thank you for registering"))
		{
			System.out.println("Your registered successfully- TEST PASSED");
		}
		else
		{
			System.out.println("Your registered failed- TEST FAILED");
		}
		driver.close();
	}

}


