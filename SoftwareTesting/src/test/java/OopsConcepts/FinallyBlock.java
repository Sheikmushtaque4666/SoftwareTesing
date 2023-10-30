package OopsConcepts;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("Program is Started");
		System.out.println("Program is in Progress");
		
		//Arithmetic Exception
		int a=100;
		try {
		System.out.println(a/2);
		}
		catch(ArithmeticException e) {
			System.out.println("Entered into catch block");
		}
		finally {
			System.out.println("Entered into finally block");
		}
		

		System.out.println("Program is Completed");
		System.out.println("Program is Executed");

	}

}
