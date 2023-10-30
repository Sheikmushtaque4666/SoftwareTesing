/*
 1.setup--->open browser and application
 2.login
 3.close
 */
package TestNG;

import org.testng.annotations.Test;

public class FirstTestCase {
	
	@Test(priority=1)
	void setup()
	{
		System.out.println("Opening browser");
	}
	
	@Test(priority=2)
	void login()
	{
		System.out.println("This is login test ");
	}

	@Test(priority=3)
	void teardown()
	{
		System.out.println("Close browser");
	}


}
