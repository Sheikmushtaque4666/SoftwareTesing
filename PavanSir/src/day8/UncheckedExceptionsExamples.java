package day8;

public class UncheckedExceptionsExamples {

	public static void main(String[] args) {
	
		System.out.println("Program is started");
		System.out.println("Program is progress");
		
	/*	//----->Arithmetic Exception
		
		int a=100;
		try
		{
		     System.out.println(a/0);//throw arithmetic exception
		}
		catch(ArithmeticException e)
		{
			System.out.println("Entered into catch block");
		}  */
		
		
		
	/*	//----->NullPointer Exception
		
		String s=null;
		try 
		{
		System.out.println(s.length());//throw nullpointer exception
		}
		catch(Exception e)
		{
			System.out.println("Entered into catch block");
		} */
		
		//----->NumberFormat Exception
		String x="abc";
		//int i=Integer.parseInt(x);//throw numberformat exception
		
		//----->ArrayIndexOutOfBound Exception
		int arr[]=new int[5];
		//arr[10]=100;//throw array indexoutofbound exception
		
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");



	}

}
