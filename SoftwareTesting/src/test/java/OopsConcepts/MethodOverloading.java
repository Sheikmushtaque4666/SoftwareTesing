package OopsConcepts;

public class MethodOverloading {
	 //By using MethodOverloading
	
	void add(int a,int b) {
		System.out.println(a+b);//m1
		}
	void add(String fname,String lname) {
		System.out.println(fname+" "+lname);//m2
		}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);//m3
		}
	void add(int a,double b) {
		System.out.println(a+b);//m4
		}
	void add(double a,double b) {
		System.out.println(a+b);//m5
		}
	
	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.add(10, 20);//m1 30
		mo.add("kanna","ssv");//m2
		mo.add(100,200, 300);//m3
		mo.add(5,1000.00);//m4
		mo.add(1000.00,20000.00);//m5
		
	}

}
