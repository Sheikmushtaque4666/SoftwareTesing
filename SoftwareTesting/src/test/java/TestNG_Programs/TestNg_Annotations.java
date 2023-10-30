package TestNG_Programs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Annotations {

	@BeforeSuite
	void method1() {
		System.out.println("This is my BeforeSuite");
	}

	@BeforeTest
	void method2() {
		System.out.println("This is my BeforeTest");
	}
	@BeforeClass
	void method3() {
		System.out.println("This is my BeforeClass");
	}
	@BeforeMethod
	void method4() {
		System.out.println("This is my BeforeMethod");
	}
	@Test
	void test() {
		System.out.println("This is my Test case1");

	}
	@AfterMethod
	void method5() {
		System.out.println("This is my AfterMethod");
	}

	@AfterClass
	void method6() {
		System.out.println("This is my AfterClass");
	}

	@AfterTest
	void method7() {
		System.out.println("This is my AfterTest");
	}

	@AfterSuite
	void method8() {
		System.out.println("This is my AfterSuite");
	}
	
	@Test
	void test1() {
		System.out.println("This is my Test case2");
	}
	
	@Test
	void test3() {
		System.out.println("This is my Test case3");
	}
	
	






}
