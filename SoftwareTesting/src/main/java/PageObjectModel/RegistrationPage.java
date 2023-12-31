package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	WebDriver driver;

	By RegLink=By.linkText("REGISTER");
	By FirstName=By.name("firstName");
	By LastName=By.name("lastName");
	By phone=By.name("phone");
	By email=By.name("userName");
	By address1=By.name("address1");
	By address2=By.name("address2");
	By city=By.name("city");
	By state=By.name("state");
	By postalCode=By.name("postalCode");
	By country=By.name("country");
	By username=By.name("email");
	By password=By.name("password");
	By confirmpassword=By.name("confirmPassword");
	By registerBtn=By.name("register");

	
	RegistrationPage(WebDriver d)
	{
		//this.driver=driver
		driver=d;
	}
	
	public void clickRegLink()
	{
		driver.findElement(RegLink).click();
	}
	
	public void setFirstName(String fname)
	{
		driver.findElement(FirstName).sendKeys(fname);;
	}
	
	public void setLastName(String lname)
	{
		driver.findElement(LastName).sendKeys(lname);;
	}
	
	public void setPhone(String ph)
	{
		driver.findElement(phone).sendKeys(ph);;
	}
	
	public void setemail(String mail)
	{
		driver.findElement(email).sendKeys(mail);;
	}
	
	public void setAddress1(String addr1)
	{
		driver.findElement(address1).sendKeys(addr1);;
	}
	
	public void setAddress2(String addr2)
	{
		driver.findElement(address2).sendKeys(addr2);;
	}
	
	public void setCity(String ci)
	{
		driver.findElement(city).sendKeys(ci);;
	}
	
	public void setState(String st)
	{
		driver.findElement(state).sendKeys(st);;
	}
	
	public void setPostalCode(String pcode)
	{
		driver.findElement(postalCode).sendKeys(pcode);;
	}
	
	public void setCountry(String cn)
	{
		WebElement con=driver.findElement(country);
		Select drop=new Select(con);
		drop.selectByVisibleText(cn);
	}
	
	public void setUserName(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	
	public void setPassword(String passwrd)
	{
		driver.findElement(password).sendKeys(passwrd);
	}
	
	public void setConfirmPassword(String passwrd)
	{
		driver.findElement(confirmpassword).sendKeys(passwrd);
	}
	
	public void clickRegBtn()
	{
		driver.findElement(registerBtn).click();
	}
	
	
	

}
