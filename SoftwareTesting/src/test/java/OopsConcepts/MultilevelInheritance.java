package OopsConcepts;

	class Car{
		void Brand() {
			System.out.println("Vechile Brand:");
		}
		void Type() {
			System.out.println("Vechile Type:");
		}
		
	}
	class Bmw extends Car{
		void Speed() {
			System.out.println("Bmw speed:150");
		}
		void Color() {
			System.out.println("Bmw color:Black");
		}
	}
	class Audi extends Bmw{
		void Model() {
			System.out.println("Audi model:Top");
		}
	}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Bmw bmw=new Bmw();
		bmw.Brand();
		bmw.Type();
		bmw.Speed();
		bmw.Color();
		Audi audi=new Audi();
		audi.Model();
		
	}

}
