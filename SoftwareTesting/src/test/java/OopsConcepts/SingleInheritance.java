package OopsConcepts;

	class A{
		void display() {
			System.out.println("I am parent of B");
		}
	}
	class B extends A{
		void show() {
			System.out.println("I am child of A");
		}
	}

public class SingleInheritance {

	public static void main(String[] args) {
		B single=new B();
		single.show();
		single.display();

	}

}
