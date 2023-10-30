package OopsConcepts;

abstract class Bike{
	abstract void run();
}

public class Abstract extends Bike{
	
	void run() {
		System.out.println("Please get helmet and ride the bike");
	}

	public static void main(String[] args) {
		Abstract ab=new Abstract();
		ab.run();
		
	}

}
