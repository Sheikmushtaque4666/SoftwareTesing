package Collections;

import java.util.LinkedList;

public class LinkedList_Demo {

	public static void main(String[] args) {
		
		//How to Declare ArrayList
		LinkedList l1=new LinkedList();
		LinkedList<String> as=new LinkedList<String>();
		LinkedList<Integer> as1=new LinkedList<Integer>();
		
		//Adding values to ArrayList
		l1.add("Bobby");  //0
		l1.add("Gandhi"); //1
		l1.add("Munna");  //2
		l1.add("Chinna"); //3
		l1.add("Kanna");  //4
		l1.add("Kanna"); //5
		as1.add(3); //6

		
		//Size of ArrayList
		System.out.println("Before removing element:"+l1.size());//6
		System.out.println("Before removing element:"+l1);
		

		//Remove an element 
		l1.remove(3);
		System.out.println("After removing element:"+l1.size());//5
		System.out.println("After removing element:"+l1);
		
		//Insert a new element into array list
		l1.add(5,"Bujji");
		System.out.println(l1.size());//6
		System.out.println("After Adding new Element:"+l1);
		
		//Read values from ArrayList using for loop
		for(Object st:l1) {
		   System.out.println(st);
		}
		for(Integer st:as1) {
			System.out.println(st);
		}
		for(String st:as) {
			System.out.println(st);
		}
		
		//System.out.println(l1);
				
	}

}
