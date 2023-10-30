package day6;

class A1
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}
class B1 extends A1
{
	int b;
	void print()
	{
		System.out.println(b);
	}
}
class C extends B1
{
	int c;
	void show()
	{
		System.out.println(c);
	}
}
public class Multilevel_Inheritance {

	public static void main(String[] args) {

		/*A aobj=new A();
		aobj.a=100;
		aobj.display();*/
		
		/*B bobj=new B();
		bobj.a=100; //A
		bobj.b=200; //B
			
		bobj.display(); //A
		bobj.print(); */ //B
		
		C cobj=new C();
		cobj.a=10; //A1
		cobj.b=20; //B1
		cobj.c=30; //C
		
		cobj.display(); //A1
		cobj.print();  //B1
		cobj.show();  //C
	}

}
