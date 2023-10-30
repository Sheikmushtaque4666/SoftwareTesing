package day4;

public class Student {
	
	int sid;
	String sname;
	char grade;
	
	
	//By using Constructor 
	Student(int id,String name,char g)
	{
		sid=id;
		sname=name;
		grade=g;
	}

	//By using method variable
	void getValues(int id,String name,char g)
	{
		sid=id;
		sname=name;
		grade=g;
	}
	
	
	void display() 
	{
		System.out.println(sid+" "+sname+" "+grade);
	}
	
	public static void main(String[] args) {
		
		//1.Assign values by using reference variable
		/*Student stu1=new Student();
		stu1.sid=1010;
		stu1.sname="John";
		stu1.grade='A';
		stu1.display();*/
		
		//2.Assign values by using method
		/*Student stu1=new Student();
		stu1.getValues(1011,"Scott", 'A');
		stu1.display();*/
		
		//2.Assign values by using constructor
		Student stu1=new Student(1001,"Paul",'A');
		stu1.display();
		
	
	}

}
