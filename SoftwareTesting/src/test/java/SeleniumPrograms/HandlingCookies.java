package SeleniumPrograms;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCookies {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");


		//--->How to capture cookies from browser.
		Set<Cookie>Cookies=driver.manage().getCookies();
		System.out.println("Size of Cookies:"+Cookies.size());

		//--->How to print cookies from browser.
		for(Cookie cookie:Cookies) {
			System.out.println(cookie.getName()+"  :  "+cookie.getValue());

		}

		//--->How to add cookies to the browser.
		Cookie cookieobj=new Cookie("MyCookie123", "123456789");
		driver.manage().addCookie(cookieobj);

		Cookies=driver.manage().getCookies();


		System.out.println("Size of Cookies After adding:"+Cookies.size());

		for(Cookie cookie:Cookies) //read and print all the cookies
		{
			System.out.println(cookie.getName()+"  :  "+cookie.getValue());//prints name and value of cookies

		}

		//--->How to delete specific cookies from browser.
		driver.manage().deleteCookie(cookieobj);
		driver.manage().deleteCookieNamed("MyCookie123");
		Cookies=driver.manage().getCookies();
		System.out.println("Size of Cookies After deleting:"+Cookies.size());

		//--->How to delete all cookies from browser.
		driver.manage().deleteAllCookies();
		Cookies=driver.manage().getCookies();
		System.out.println("Size of Cookies After deleting all:"+Cookies.size());



		driver.close();

	}

}
