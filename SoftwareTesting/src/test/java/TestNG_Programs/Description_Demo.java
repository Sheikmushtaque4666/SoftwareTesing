package TestNG_Programs;

import org.testng.annotations.Test;

public class Description_Demo {
	
	@Test(description="Web Application")
	public void test1() {
		System.out.println("Test case 1");
	}
	
	@Test(description="Api Application")
	public void test2() {
		System.out.println("Test case 2");
	}
	@Test(description="Mobile Application")
	public void test3() {
		System.out.println("Test case 3");
	}

}
