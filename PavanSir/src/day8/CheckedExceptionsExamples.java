package day8;

public class CheckedExceptionsExamples {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("Program is started");
		System.out.println("Program is progress");
		
	/*	//----->try....catch
		try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}   */
		
		//----->Throws
		Thread.sleep(5000);
		
		
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");


	}

}
