package day2;

public class JumpingStatements {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i); //1 2 3 4
		}
		
		for(int i=1; i<=10; i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i); //1 2 3 4 6 7 8 9 10
		}
		
		for(int i=1; i<=10; i++)
		{
			if(i==3 || i==5 || i==7)
			{
				continue;
			}
			System.out.println(i); //1 2 4 6 8 9 10
		}

	}

}
