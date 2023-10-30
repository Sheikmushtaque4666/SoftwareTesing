package BatchTesting;

import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void loginByemail ()
	{

		System.out.println("This is login by email");
	}

	@Test
	public void loginByfacebook()
	{

		System.out.println("This is login by facebook");
	}

	@Test
	public void loginBytwitter()
	{

		System.out.println("This is login by twitter");
	}

}
