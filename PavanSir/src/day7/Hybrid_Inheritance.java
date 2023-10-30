package day7;

class A1
{
	void m1()
	{
		System.out.println("This is m1 method  from A1 class");
	}
}
interface B1
{
	void m2();
}
interface B2
{
	void m3();
}

public class Hybrid_Inheritance extends A1 implements B1,B2 {
	
	public void m2()
	{
		System.out.println("This is m2 method from B1 interface");
	}
	public void m3()
	{
		System.out.println("This is m3 method from B2 interface");
	}
	public static void main(String[] args) {
		
		Hybrid_Inheritance hi=new Hybrid_Inheritance();
		hi.m1();
		hi.m2();
		hi.m3();

	}

}
