package TestNG_Programs;

import org.testng.annotations.Test;

public class Priority_Demo {

	@Test(priority=-1)
	void sample() {
		System.out.println("This is my sample");
	}

	@Test(priority=100)
	void demo() {
		System.out.println("This is my demo");
	}

	@Test(priority=-3)
	void display() {
		System.out.println("This is my display");
	}

	@Test(priority=0)
	void print() {
		System.out.println("This is my print");
	}

	@Test
	void test() {
		System.out.println("This is my test");
	}

	@Test(priority=1)
	void animal() {
		System.out.println("This is my animal");
	}

}
