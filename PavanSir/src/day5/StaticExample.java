package day5;

public class StaticExample {
	
	static int a=10;  //static variable
	       int b=20;  //non-static variable
	       
	static void m1()  //static method
	{
		System.out.println("This is m1 - static method");
	}
	void m2()        //non-static method
	{
		System.out.println("This is m2 - non-static method");

	}
	void m3()
	{
		System.out.println("This is m3 method - non-static");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	public static void main(String[] args) {
		
		//1.Static methods can access only static stuff directly without creating object
		System.out.println(a);
		m1();
		
		//System.out.println(b); incorrect, because b is non-static variable
		//m2();//incorrect, because m2 is non-static method
		
		
		//2.Static methods can also access non static stuff but through object.
		StaticExample se=new StaticExample();
		System.out.println(se.b);//non-static variable through object
		se.m2();//non-static method through object
		
		//3.Non static methods can access both static and non static stuff direct
		se.m3();

	}

}
