package day6;

public class FinalVariable {
	
	final int speed=30; //final variable , so we cannot change this value

	public static void main(String[] args) {
		
		FinalVariable fv=new FinalVariable();
		//fv.speed=100; //compile time error
		System.out.println(fv.speed);
		


	}

}
