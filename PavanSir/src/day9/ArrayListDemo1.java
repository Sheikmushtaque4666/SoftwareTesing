package day9;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
	
		//1.How to declare array list
		
		ArrayList list=new ArrayList();  //we can store any type of elements
		//ArrayList<Integer> list=new ArrayList<Integer>(); //we can store integers values
		//ArrayList<String> list=new ArrayList<String>(); //we can store String values
				
		//2.Adding values to array list
		list.add("Munna");
		list.add("Chinna");
		list.add("Kanna");
		list.add("Anna");
		list.add(101);
		list.add('K');
				
		//3.Size of array list
		System.out.println(list.size()); //4
		System.out.println("Before removing elements:"+list);
				
		//4.Remove an element
		list.remove(2); //remove kanna
		System.out.println(list.size());//3
		System.out.println("After removing elements:"+list);
				
		//5.Inserting a new element into array list
		list.add(1,"Bobby");
		System.out.println(list.size());//4
		System.out.println("After inserting element:"+list);
				
		//6.Read values from array list using for loop
		for(Object s:list)
		{
			System.out.println(s);
		}
	
	}

}
