package OopsConcepts;
	class stud{
		int rollno;
		String name;
		float fee;
		
		stud(int rollno,String name,float fee){
			this.rollno=rollno;
			this.name=name;
			this.fee=fee;
		}
			
			void display() {
				System.out.println(rollno+" "+name+" "+fee);
			}
			
		}

	public class ThisKeyword {

	public static void main(String[] args) {
		stud s1=new stud(111,"kanna",10000f);
		stud s2=new stud(112,"mushtaque",11000f);
		s1.display();
		s2.display();
		}
}
