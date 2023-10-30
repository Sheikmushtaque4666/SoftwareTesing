package OopsConcepts;

public class StaticExample {
	static int a=10;// static variable
	int b=20;       //non static variable 
	
	static void m1() { //static method
		System.out.println("This is m1 -static method");
	}
	void m2() { //non static method
		System.out.println("This is m2 -non static method");
	}
	
	//3.Non static methods can access both static and non static direct
	void m3() {
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) {
		//1.Static methods can access only static stuff(directly without creating object)
		System.out.println(StaticExample.a); //This is calling variable
		StaticExample.m1();//This is calling method
		
		//without creating object
		/*System.out.println(StaticExample.b);//incorrect b is non static variable
		StaticExample.m2();*/ //incorrect m2 is not static method
		
		//2.Static methods can access non static stuff but through object.
		//with non static
		StaticExample se=new StaticExample();
		System.out.println(se.b);
		se.m2();
		//with static
		System.out.println(se.a);
		se.m1();
		
		StaticExample se1=new StaticExample();
		se1.m3();
		
		

	}

}
