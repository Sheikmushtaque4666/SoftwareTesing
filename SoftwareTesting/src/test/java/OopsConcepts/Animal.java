package OopsConcepts;

public class Animal {
	
	        //By using instance variable
			String Color;
			int Weight;
			double Height;
			
			//Default constructor
			Animal(){
				String Color="Brown";
				int Weight=5;
				double Height=6;
				System.out.println(Color+" "+Weight+" "+Height);
			}
			
			//By using constructor variable/-->Parameterized constructor
			Animal(String color,int weight,double height){
				Color=color;
				Weight=weight;
				Height=height;
				
			}
			
			//By using method variable
			void show(String color,int weight,double height) {
				Color=color;
				Weight=weight;
				Height=height;
			}
			void display()
			{
				System.out.println(Color+" "+Weight+" "+Height);
			}
			
			public static void main(String[] args) {
				//Animal an=new Animal("Black",4,6);//constructor object
				//an.show("White",3,6);//method object
		        //an.display();
				Animal an=new Animal();//constructor 
				

	}

}
