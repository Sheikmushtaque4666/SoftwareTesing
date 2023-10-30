package OopsConcepts;

	class student{
		private String name;
		
        //getter method for name read name
		public String getName() {
			return name;
		}
		
        //Setter method for name update name
		public void setName(String name) {
			this.name = name;
		}
	}

public class Encapsulation {

	public static void main(String[] args) {
		student s=new student();
		s.setName("Khanna");
		System.out.println(s.getName());

	}

}
