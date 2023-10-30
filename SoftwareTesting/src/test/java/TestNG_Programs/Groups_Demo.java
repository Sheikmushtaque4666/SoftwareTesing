package TestNG_Programs;

import org.testng.annotations.Test;

public class Groups_Demo {
	
	@Test(groups="automation")
	public void aman() {
		System.out.println("Yes I am Aman");
	}
	
	@Test(groups="automation")
	public void akash() {
		System.out.println("Yes I am Akash");
	}
	
	@Test(groups="IT")
	public void ashish() {
		System.out.println("Yes I am Ashis");
	}
	
	@Test(groups="Testing")
	public void bhart() {
		System.out.println("Yes I am Bhart");
	}

}
