package accessModifiers1;

public class Z
{
	//--->Private
	//private int data=100;
	//private void m1() {	}
	
	//--->Default
	/*int data=100;
	void m1() 
	{
		System.out.println(data);
	}*/

}

public class accessModifiers1 {

	public static void main(String[] args) {
		
		Z aobj=new Z();
		aobj.data=200;//compile time error
		aobj.m1();//compile time error
		


	}

}
