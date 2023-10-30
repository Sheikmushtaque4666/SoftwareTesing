/*Test case
 ---------
 1)open a browser
 2)open url(http://newtours.demoaut.com/)
 3)Enter user name
 4)Enter password
 5)Click on ok
 6)Check the page title*/

package seleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest { 

	public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\sheik\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
    //WebDriverManage.chromedriver().setup();
		
	//ChromeDriver driver=new ChromeDriver();  //Approach1.Invoke the browser
	WebDriver driver=new ChromeDriver();      //Approach2.Invoke the browser
	driver.manage().window().maximize();

	driver.get("https://demo.guru99.com/selenium/newtours/"); //open URL in the browser
	
	driver.findElement(By.name("userName")).sendKeys("mercury");//Approach 1.Enter username
	
	/*WebElement username=driver.findElement(By.name("userName")); //Approach 2.Enter username
	username.sendKeys("mercury");*/
	
	driver.findElement(By.name("password")).sendKeys("mercury");//Enter password
	
	driver.findElement(By.name("submit")).click();//click on sign in button
	
	String exptitle="Welcome: Mercury Tours";
	String acttitle=driver.getTitle();//Returns the title of the page

	
	
	//Validation
	if(exptitle.equals(acttitle))
	{
		System.out.println("Test is passed");
	}
	else
	{
		System.out.println("Test is failed");
	}
	
	  //driver.close();//close the browser
	
	}

}
