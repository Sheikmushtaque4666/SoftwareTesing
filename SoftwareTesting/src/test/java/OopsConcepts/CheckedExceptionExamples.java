package OopsConcepts;

public class CheckedExceptionExamples {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program is Started");
		System.out.println("Program is in Progress");
		
		
		/*try 
		 * {
			Thread.sleep(3000);
		   } 
		catch (InterruptedException e) 
		{
		  e.printStackTrace();
		}*/
		
		
		Thread.sleep(3000);
		
		
		System.out.println("Program is Completed");
		System.out.println("Program is Executed");

	}

}
