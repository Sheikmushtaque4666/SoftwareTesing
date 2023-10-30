package OopsConcepts;
	final class Bike1 { //final class
		final void run() { //final method
			System.out.println("Running...");
		}
	}
	class Honda extends Bike1{
		void run() {
			super.run();
			System.out.println("Started.....");
		}
	}

public class FinalKeyword {
	final int speed=40;// final variable

	public static void main(String[] args) {
		FinalKeyword fk=new FinalKeyword();
		//fk.speed=100; //compile time error
		//System.out.println(fk.speed);
		
		Honda h=new Honda();
		h.run();
		

	}

}
