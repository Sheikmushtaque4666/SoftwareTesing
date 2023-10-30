package OopsConcepts;

public class Methods {
	int x=10;
	int y=20;
	
	//Case1-not taking parameters and also not returning any value.
	void sum1() {
		System.out.println(x+y);
	}
	//Case2-not taking parameters and returning value.
	int sum2() {
		return x+y;
	}
	//Case3-taking parameters and also not returning any value.
	void sum3(int a ,int b) {
		System.out.println(a+b);
	}
	//Case4-taking parameters and also returning any value.
	int sum4(int a,int b){
		return a+b;
		
	}
	String sum5(String name) {
		return name;
	}
	

	public static void main(String[] args) {
		Methods md=new Methods();//case1
		md.sum1();
		
		System.out.println(md.sum2());//way1(for case2)
		
		int rev=md.sum2();//way2(for case2)
		System.out.println(rev);
		
		md.sum3(100,200);//case3
		
		System.out.println(md.sum4(100,300));//case4
		System.out.println(md.sum5("Mushtaque"));//case4
		

	}

}
