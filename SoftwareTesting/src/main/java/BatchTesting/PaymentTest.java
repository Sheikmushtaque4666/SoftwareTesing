package BatchTesting;

import org.testng.annotations.Test;

public class PaymentTest {

	@Test
	public void paymentindollar()
	{

		System.out.println("This is payment by dollar method");
	}

	@Test
	public void paymentinrupees()
	{

		System.out.println("This is payment by rupees method");
	}

}
