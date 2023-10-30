package day6;

class A  //Parent class
{
	int a; //Variable
	void display() //Method
	{
		System.out.println(a);
	}
	
}
class B extends A   //B is child class, A is parent class
{
	int b;
	void print()
	{
		System.out.println(b);
	}
}
public class Single_Inheritance {

	public static void main(String[] args) {
		 
		/*A aobj=new A();
		aobj.a=100;
		aobj.display();*/
		
		B bobj=new B();
		bobj.a=100; //A
		bobj.b=200; //B
		bobj.display(); //A
		bobj.print(); //B
		
	}

}
