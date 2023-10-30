package day5;

public class ThisKeyword {
	
	int a,b;//instance variable or class variable
	
	void getValues(int a, int b)  //method variables/external variable
	{
		this.a=a;
		this.b=b;
	}
	void printValues()
	{
		System.out.println(a);
		System.out.println(b);

	}
	
	public static void main(String[] args) {
		ThisKeyword tk=new ThisKeyword();
		tk.getValues(10,20);
		tk.printValues();

	}

}
