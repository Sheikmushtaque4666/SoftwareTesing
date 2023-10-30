package TestNG_Programs;

import org.testng.annotations.Test;

public class EnabledOrDisabled {
	
	@Test(enabled=false)
	public void MobileLoginPersonalLoan() {
		System.out.println("Mobile Login Personal Loan");
	}
	
	@Test
	public void WebLoginPersonalLoan() {
		System.out.println("Web Login Personal Loan");
	}
	
	@Test
	public void ApiLoginPersonalLoan() {
		System.out.println("API Login Personal Loan");
	}
	
	@Test(enabled=false)
	public void MobileLoginAutomobileLoan() {
		System.out.println("Mobile Login Automobile Loan");
	}
	
	@Test
	public void WebLoginAutomobileLoan() {
		System.out.println("Web Login Automobile Loan");
	}
	
	@Test
	public void ApiLoginAutomobileLoan() {
		System.out.println("API Login Automobile Loan");
	}
	
	
}
