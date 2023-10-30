package OopsConcepts;

		interface A1{
			int a=10; //by default variable interface are static and final
			void m1(); //Abstract method ,by default public
		}

public class Interface implements A1 {
	
	 public void m1() 
	 {
		 System.out.println(a);
		 
	 }

	public static void main(String[] args) {
		
		Interface i=new Interface();
		i.m1();
		
		A1 a=new Interface();
		a.m1();
		
	}

}
