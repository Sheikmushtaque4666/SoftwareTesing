package day6;

public class Animal
{
	String color="White"; //variable1
	
	void eating()   //method1
	{
		 System.out.println("Eating...");
	}
	Animal() //constructor1
	{
		System.out.println("Animal is created");
	}
}
class Dog extends Animal
{
	String color="Black"; //variable2
	
	void displaycolor()  
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	
	void eating()//method2
	{
		 System.out.println("Eating Bread...");
		 super.eating();
	}
	Dog()//constructor2
	{
		super();//Invoked parent class constructor
		System.out.println("Dog is created");
	}
}

