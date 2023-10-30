package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo5_XPathAxes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		//----->Self- Selects the current node
		String text=driver.findElement(By.xpath("//a[contains(text(),'KIOCL')]/self::a")).getText();
		System.out.println(text); //KIOCL

		
		//----->Parent- Selects the parent of the current node(always one)
		text=driver.findElement(By.xpath("//a[contains(text(),'KIOCL')]/parent::td")).getText();
		System.out.println(text); //KIOCL
		
		//---->Child- Selects all children of the current node(one or many)
		List<WebElement> childs=driver.findElements(By.xpath("//a[contains(text(),'KIOCL')]/ancestor::tr/child::td"));
		System.out.println("Number of child elements:"+childs.size());//5
		
		//----->Ancestor- Selects all ancestors(parent, grandparent, etc)
		text=driver.findElement(By.xpath("//a[contains(text(),'KIOCL')]/ancestor::tr")).getText();
		System.out.println(text); //KIOCL A 259.15 280.55 + 8.26
		
		//----->Descendant- Selects all descendants(children, grandchildren, etc)of the current node
		List<WebElement> descendants=driver.findElements(By.xpath("//a[contains(text(),'KIOCL')]/ancestor::tr/descendant::*"));
		System.out.println("Number of descendant elements:"+descendants.size());//7
		
		//----->Following- Selects everything in the document after the closing tag of the current node
		List<WebElement>followingnodes=driver.findElements(By.xpath("//a[contains(text(),'KIOCL')]/ancestor::tr/following::tr"));
		System.out.println("Number of following nodes:"+followingnodes.size());//Number of following nodes:392
		
		//----->Following-Sibling- Selects all siblings after the current node
		List<WebElement>followingsiblings=driver.findElements(By.xpath("//a[contains(text(),'KIOCL')]/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of following-sibling nodes:"+followingsiblings.size());//Number of following-sibling nodes:390
		
		//----->Preceding- Selects all nodes that appear before the current node in the document
		List<WebElement>precedings=driver.findElements(By.xpath("//a[contains(text(),'KIOCL')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of Preceding nodes:"+precedings.size());//Number of Preceding nodes:17
		
		//----->Preceding-Sibling- Selects all siblings before the current node
		List<WebElement>precedingsibling=driver.findElements(By.xpath("//a[contains(text(),'KIOCL')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of Preceding-sibling nodes:"+precedingsibling.size());//Number of Preceding-sibling nodes:16
		
		
		
		
	}

}
