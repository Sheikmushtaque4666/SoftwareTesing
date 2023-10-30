package day8;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("Program started");
		
		int a=100;
		try
		{
		System.out.println(a/2);
		}
		catch(Exception e)
		{
			System.out.println("Entered into catch block");
		}
		finally
		{
			System.out.println("Entered into finally block");
		}
		
		System.out.println("Program exited");
		
		}
}
