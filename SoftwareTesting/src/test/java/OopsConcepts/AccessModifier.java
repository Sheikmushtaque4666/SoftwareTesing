package OopsConcepts;

	class Demo1
	{
		public int data=10;// public variable
		public void m1() { // public method
		System.out.println("Method m1");
			
	}
		
	}
	class Demo2
	{
		private int data=10;// private variable
		private void m2() { // private method
		System.out.println("Method m2");
			
		}
		
	}
	class Demo3
	{
		int data=10;// default variable
		void m3() { // default method
		System.out.println("Method m3");
			
		}
		
	}
	class Demo4{
		protected int data=10;// protected variable
		protected void m4() { // protected method
		System.out.println("Method m4");
			
		}
		
	}

public class AccessModifier {

	public static void main(String[] args) {
		Demo1 d=new Demo1();//public
		d.data=100;
		d.m1();
		
		Demo3 d3=new Demo3();//default
		d3.data=100;
		d3.m3();
		

		Demo4 d4=new Demo4();//protected
		d4.data=200;
		d4.m4();
		
		
		

	}

}
