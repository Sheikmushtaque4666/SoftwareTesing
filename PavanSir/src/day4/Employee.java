package day4;

public class Employee {
	
	int eid;
	String ename;
	double sal;
	int deptno;
	String job;
	
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(deptno);
		System.out.println(job);
	}
	
	public static void main(String[] args) {
		
		Employee emp1=new Employee(); //creating object
		emp1.eid=101;
		emp1.ename="David";
		emp1.sal=25000;
		emp1.deptno=10;
		emp1.job="manager";
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="John";
		emp2.sal=50000;
		emp2.deptno=20;
		emp2.job="CEO";
		emp2.display();
		
	}

}
