package OopsConcepts;
	class Animal1{
		String color="White";//parent variable
		
		void eating() { //parent method
			System.out.println("Eating..........");
		}
		Animal1(){ //parent constructor
			System.out.println("Animal is created");
		}
	}
	
	class Dog extends Animal1{
		String color="Black"; //child variable
		
		void display() { //child method
			System.out.println(color);
			System.out.println(super.color);

		}
		void eating() {  //child method
			super.eating();
			System.out.println("Eating Bread..........");
		}
		Dog(){ //child constructor
			super();
			System.out.println("Dog is created");
		}
	}

public class SuperKeyword {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.display();
		d.eating();

	}

}
