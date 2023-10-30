package OopsConcepts;

public class EmpInfo {

	public static void main(String[] args) {
		//main()
		Employee em1=new Employee();
		em1.eid=101;
		em1.ename="John";
		em1.sal=10000.00;
		em1.depno=10;
		em1.job="Tester";
		em1.display();
		
		Employee em2=new Employee();//Object created
		em2.eid=102;
		em2.ename="khanna";
		em2.sal=20000.00;
		em2.depno=11;
		em2.job="Developer";
		em2.display();
		
		Employee em3=new Employee();//Object created
		em3.eid=103;
		em3.ename="Udith";
		em3.sal=30000.00;
		em3.depno=12;
		em3.job="Manager";
		em3.display();
 
	}

}
