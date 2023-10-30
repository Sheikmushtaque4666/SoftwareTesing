package TestNG_Programs;

import org.testng.annotations.Test;

public class Timeout_Demo {
	
	@Test(timeOut=200)
	public void test1() {
		System.out.println("Test case 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test case 2");
	}
	
	@Test
	public void test3() {
		System.out.println("Test case 3");
	}
	
	@Test
	public void test4() {
		System.out.println("Test case 4");
	}

}
