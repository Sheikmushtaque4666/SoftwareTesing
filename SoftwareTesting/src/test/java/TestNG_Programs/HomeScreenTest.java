package TestNG_Programs;

import org.testng.annotations.Test;

public class HomeScreenTest {

	@Test
	public void LaunchApplication() 
	{
		System.out.println("Application Launch is Passed");
	}
	
	@Test
	public void VerifyTitle() 
	{
		System.out.println("Verify Title is Passed");
	}
	
	@Test
	public void VerifyLogo() 
	{
		System.out.println("Verify Logo is Passed");
	}
}
