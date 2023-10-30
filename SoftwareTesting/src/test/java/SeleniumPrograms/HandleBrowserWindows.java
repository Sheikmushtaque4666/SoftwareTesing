package SeleniumPrograms;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindows {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		//--->getWindowHandle() //return Id of the single browser window
		//String windowID=driver.getWindowHandle();
		//System.out.println(windowID); //67669E408B3214C262F1DD7E1DA7FD6B


		//--->getWindowHandles() //return Id of the multiple browser window
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> windowId=driver.getWindowHandles();

		/*	//FirstMethod---iterator()
		Iterator<String> it= windowId.iterator();
		String parentwindowID=it.next();
		String childwindowID=it.next();

		System.out.println("Parent window ID:"+parentwindowID);
		System.out.println("Child window ID:"+childwindowID); */

		//SecondMethod---ListArrayList
		List<String> windowIdList=new ArrayList(windowId);
		String parentwindowID=windowIdList.get(0);
		String childwindowID=windowIdList.get(1);

		System.out.println("Parent window ID:"+parentwindowID);
		System.out.println("Child window ID:"+childwindowID);

		//How to use window id's for switching

		driver.switchTo().window(parentwindowID);
		System.out.println("Parent Window Title :" +driver.getTitle());

		driver.switchTo().window(childwindowID);
		System.out.println("Child Window Title :" +driver.getTitle());

		//for loop
		for(String winid:windowIdList)
		{
			System.out.println(winid);
			String title=driver.switchTo().window(winid).getTitle();
			System.out.println(title);
		}



		//driver.close();
		driver.quit();

	}

}
