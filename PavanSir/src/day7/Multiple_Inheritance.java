package day7;

interface ABC
{
	int a=101;
	void m1();
}
interface XYZ
{
	int x=102;
	void m2();
}

public class Multiple_Inheritance implements ABC,XYZ{
	
	public void m1()
	{
		System.out.println(a);
	}
	public void m2()
	{
		System.out.println(x);
	}

	public static void main(String[] args) {
		
		Multiple_Inheritance mi=new Multiple_Inheritance();
		mi.m1();
		mi.m2();
		
	}

}
