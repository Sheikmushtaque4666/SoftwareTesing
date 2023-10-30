package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesExample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		//--->How to capture cookies from browser.
		Set<Cookie>Cookies=driver.manage().getCookies();//capture all the cookies from the browser
		System.out.println("Size of Cookies:"+Cookies.size());//print size of cookies

		//--->How to print cookies from browser.
		/*	for(Cookie cookie:Cookies) //read and print all the cookies
		{
			System.out.println(cookie.getName()+"  :  "+cookie.getValue());//prints name and value of cookies

		}  */

		//System.out.println(driver.manage().getCookieNamed("session-id-time"));//prints specific cookie according to the name

		//--->How to add cookies to the browser.
		Cookie cookieobj=new Cookie("MyCookie123", "123456789");
		driver.manage().addCookie(cookieobj);

		Cookies=driver.manage().getCookies();


		System.out.println("Size of Cookies:"+Cookies.size());//print size of cookies


		for(Cookie cookie:Cookies) //read and print all the cookies
		{
			System.out.println(cookie.getName()+"  :  "+cookie.getValue());//prints name and value of cookies

		} 

		//delete the cookie
		driver.manage().deleteCookie(cookieobj);
		
		Cookies=driver.manage().getCookies();


		System.out.println("Size of Cookies:"+Cookies.size());//print size of cookies


		for(Cookie cookie:Cookies) //read and print all the cookies
		{
			System.out.println(cookie.getName()+"  :  "+cookie.getValue());//prints name and value of cookies

		} 
		
		//delete all cookies
		driver.manage().deleteAllCookies();
		Cookies=driver.manage().getCookies();
		
		System.out.println("Size of Cookies After deleting all:"+Cookies.size());


	}
}
