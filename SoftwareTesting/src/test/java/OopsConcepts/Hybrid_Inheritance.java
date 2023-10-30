package OopsConcepts;

class 	X
{
	void m1() 
	{
		System.out.println("This is m1 method  from X class");
	}
}

interface  Y1
{
	void m2();
}

interface  Y2
{
	void m3();
}

public class Hybrid_Inheritance extends X implements Y1,Y2{
	
	public void m2() 
	{
		System.out.println("This is m2 method from Y1 interface");
	}
	public void m3() 
	{
		System.out.println("This is m3 method from Y2 interface");
	}

	public static void main(String[] args) 
	{
		Hybrid_Inheritance hi=new Hybrid_Inheritance();
		hi.m1();
		hi.m2();
		hi.m3();

	}

}
