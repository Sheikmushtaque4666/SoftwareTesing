package OopsConcepts;

public class UncheckedExceptionExamples {

	public static void main(String[] args) {
		
		System.out.println("Program is Started");
		System.out.println("Program is in Progress");
		
		/*Arithmetic Exception
		int a=100;
		try {
		System.out.println(a/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Entered into catch block");
		}*/
		
		/*NullPointerException
		String s=null;
		try {
		System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println("Entered into catch block");
		}*/
		
		/*NumberFormatException
		String x="abc";
		try {
		int i=Integer.parseInt(x);
		}
		catch(NumberFormatException e) {
			System.out.println("Entered into catch block");
		}*/
		
		/*ArrayIndexOutOfBoundsException
		int arr[]=new int[5];
		try {
		arr[10]=100;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Entered into catch block");
		}*/
		
		
		
		System.out.println("Program is Completed");
		System.out.println("Program is Executed");




	}

}
