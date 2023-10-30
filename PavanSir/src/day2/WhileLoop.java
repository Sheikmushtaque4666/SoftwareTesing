package day2;

public class WhileLoop {

	public static void main(String[] args) {
		
		int i=1;
		
		//1 to 10 numbers
		while(i<=10)
		{
			System.out.println(i); 
			i++;
		}
		
		//Even numbers between 1 to 10
		i=2;
		
		while(i<=10)
		{
			System.out.println(i);
			i+=2; //i=i+2;
		}
		
		//Print 1 to 10 descending order
		i=10;
		while(i>0)
		{
			System.out.println(i);
			i--;
		}
				
				

	}

}
