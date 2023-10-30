package OopsConcepts;

	interface ABCD
	{
		int x=100;
		void m1();
    }
	interface XYZW
	{
		int y=200;
		void m2();
	}

public class Multiple_Inheritance implements ABCD,XYZW {
	
	public void m1() 
	{
		System.out.println(x);
	}
	public void m2() 
	{
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		Multiple_Inheritance mi=new Multiple_Inheritance();
		mi.m1();
		mi.m2();
		
	}

}
