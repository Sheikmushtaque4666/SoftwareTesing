package day4;

public class ConstructorTypes {
	
	int x;
	int y;
	
	ConstructorTypes() //default constructor
	{
		x=20;
		y=30;
	}
	
	ConstructorTypes(int a,int b) //parameterized constructor
	{
		x=a;
		y=b;
	}
	
	
	void display()
	{
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
		
		ConstructorTypes cd=new ConstructorTypes(); //Invokes default constructor
		cd.display();
		
		ConstructorTypes cd1=new ConstructorTypes(200,300); //Invokes parameterized constructor
		cd1.display();
	}

}
