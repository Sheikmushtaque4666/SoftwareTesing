package OopsConcepts;

public class Studnt {
	
	        //Variable
			int srollno;
			String sname;
			String subject;
			int smarks;
			
			//methods
			void display() {
				System.out.println(srollno);
				System.out.println(sname);
				System.out.println(subject);
				System.out.println(smarks);
				
				System.out.println(srollno+" "+sname+" "+subject+" "+smarks);
			}
			public static void main(String[] args) {
			//Object created
				Studnt s1=new Studnt();
				s1.srollno=1010;
				s1.sname="Sheik";
				s1.subject="Maths";
				s1.smarks=80;
				s1.display();
		 
				Studnt s2=new Studnt();
				s2.srollno=1011;
				s2.sname="Mushtaque";
				s2.subject="Physics";
				s2.smarks=90;
				s2.display();
		 
				Studnt s3=new Studnt();
				s3.srollno=1012;
				s3.sname="Khanna";
				s3.subject="Social";
				s3.smarks=95;
				s3.display();
	
		}

}
