package JavaPrograms;
public class Operators {
public static void main(String[] args) {
	
	//Arithmetic operator---------->+ - * / %
	System.out.println("******Arithmetic operator******");
	int a=10;
	int b=20;
	
	System.out.println("Sum of a and b is:"+(a+b));
	System.out.println("Diff of a and b is:"+(a-b));
	System.out.println("Mul of a and b is:"+(a*b));
	System.out.println("Div of a and b is:"+(a/b));
	System.out.println("Mod of a and b is:"+(a%b));
	
	//Relational Operator---------->== < >  <= >=  !=
	System.out.println("******Relational Operator******");
	
	System.out.println(a==b);
	System.out.println(a<b);
	System.out.println(a>b);
	System.out.println(a<=b);
	System.out.println(a>=b);
	System.out.println(a!=b);

	//Logical Operator---------->&& ||
	System.out.println("******Logical Operator******");
	
	boolean x=true;
	boolean y=false;
	
	System.out.println(x && y);
	System.out.println(x || y);
	System.out.println(!x);
	System.out.println(!y);
	
	//Increment/Decrement operator---------->++ --
	System.out.println("******Increment/Decrement operator******");
	
	int p=10;
	p++;//p=p+1 -->p=10+1
	System.out.println(p);//11
	
	int q=10;
	q--;//q=q-1 -->q=10-1
	System.out.println(q);//9

	
	
	

 
	}
}
