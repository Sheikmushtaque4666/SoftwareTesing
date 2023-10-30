package OopsConcepts;

	abstract class Test{
		
		Test(int a){ // parameterized constructor
			System.out.println("parameterized constructor of an anstract class a="+a);
			
		}
	}
	
public class AbstarctClassTest extends Test{
	    AbstarctClassTest()
	    {
	    	super(20);
		System.out.println("Test class constructor");
	    }

	    public static void main(String[] args) {
		AbstarctClassTest ac=new AbstarctClassTest();
		

	}

}
