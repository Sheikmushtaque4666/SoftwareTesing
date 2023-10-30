package day7;


interface A
{
	int a=10; //by default variable interface are static and final
	void m1(); //Abstract method ,by default public
}

public class Interface implements A {
	
	public void m1()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		/*Interface i=new Interface(); //with instantiate 
		i.m1();*/
		
		A a=new Interface(); ////without instantiate 
		a.m1();
		

	}

}
