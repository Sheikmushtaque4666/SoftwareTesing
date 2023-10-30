package JsExecutors;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	//--->flashByJs
	public static void flashByJs(WebElement element,WebDriver driver) {
		String bgcolor=element.getCssValue("backgroundColor");

		for(int i=0;i<500;i++) {
			changecolorByJs("#000000", element,driver);//1
			changecolorByJs(bgcolor, element,driver);//2

		}
	}
	public static void changecolorByJs(String color,WebElement element,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor='" +color+" ' ",element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {

		}
	}
	//--->drawBorder
	public static void drawBorder(WebElement element,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'",element);

	}
	//--->getTitleByJs
	public static String getTitleByJs(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String title=js.executeScript("return document.title;").toString();
		return title;

	}
	//---> clickElementByJs
	public static void clickElementByJs(WebElement element,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",element);

	}
	//--->generateAlertByJs
	public static void generateAlertByJs(WebDriver driver,String message) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('"+ message +"')");

	}
	//--->refreshBrowserByJs
	public static void refreshBrowserByJs(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");

	}

	//--->scrollIntoViewByJs
	public static void scrollIntoViewByJs(WebElement element,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);

	}
	//--->scrollPageDownByJs
	public static void scrollPageDownByJs(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}
	//--->scrollPageUpByJs
	public static void scrollPageUpByJs(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

	}


}

