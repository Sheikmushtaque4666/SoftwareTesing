package OopsConcepts;

	class Bank{  //parent class
		double rateofinterest(){
			return 0;
		}
	}
	class SBI extends Bank{	//child1 class
		double rateofinterest(){
			return 10.7;
		}
	}
	class ICICI extends Bank{	//child2 class
		double rateofinterest(){
			return 9.5;
		}
	}
	class AXIS extends Bank{	//child3 class
		double rateofinterest(){
			return 8.5;
		}
	}

public class MethodOverriding {

	public static void main(String[] args) {
		SBI sbi=new SBI();
		System.out.println(sbi.rateofinterest());
		
		ICICI icici=new ICICI();
		System.out.println(icici.rateofinterest());
		
		AXIS axis=new AXIS();
		System.out.println(axis.rateofinterest());
		
		}

}
