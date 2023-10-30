package day6;


class Bike
{
	final void run() ////final method, so we cannot override this method in child class
	{
		System.out.println("Running....");
	}
}
class Honda extends Bike
{
	void run()
	{
		System.out.println("Started...");
	}
}
public class FinalMethod {

	public static void main(String[] args) {

		
	}

}
