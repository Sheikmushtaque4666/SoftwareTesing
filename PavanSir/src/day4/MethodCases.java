package day4;

public class MethodCases {
	
	int x=10;
	int y=20;
	
	/* void sum() //Case1-not taking parameters and also not returned any value.
	{
		System.out.println(x+y);
	} */
	
	
	/*int sum()  //Case2-not taking parameters but returning value.
	{
		return(x+y);
	}*/
	
	/*void sum(int a,int b) //Case3-taking parameters but  not returning any value.
	{
		System.out.println(a+b);
	} */
	

	int sum(int a,int b) //Case4-method taking parameters and also returning a value.
	{
		return(a+b);
	} 
	
	
	public static void main(String[] args) {
		
		/*MethodCases mc=new MethodCases();
		mc.sum();*/ //case1
		
		/*MethodCases mc=new MethodCases();
		int res=mc.sum(); //case2
		System.out.println(res);
		System.out.println(mc.sum());*/
		
		/*MethodCases mc=new MethodCases();
		mc.sum(100,200);*/ //case3
		
		MethodCases mc=new MethodCases();
		System.out.println(mc.sum(100,200)); //case4

		
		
		

		
	}

}
