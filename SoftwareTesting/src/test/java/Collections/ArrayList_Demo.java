package Collections;

import java.util.ArrayList;

public class ArrayList_Demo {

	public static void main(String[] args) {
		
		//How to Declare ArrayList
		ArrayList list=new ArrayList();
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<String> list2=new ArrayList<String>();
		
		//Adding values to ArrayList
		list.add("Bobby");  //0
		list.add("Gandhi"); //1
		list.add("Munna");  //2
		list.add("Chinna"); //3
		list.add("Kanna");  //4
		list2.add("Kanna"); //5
		list.add(null);//6
		list.add(null);//7
		list1.add(1);//6

		
		//Size of ArrayList
		System.out.println("Before removing element:"+list.size());//6
		System.out.println("Before removing element:"+list);
		
		//Remove an element 
		list.remove(3);
		System.out.println("After removing element:"+list.size());//5
		System.out.println("After removing element:"+list);
		
		//Insert a new element into array list
		list.add(5,"Bujji");
		System.out.println(list.size());//6
		System.out.println("After Adding new Element:"+list);
		
		//Read values from ArrayList using for loop
		for(Object st:list) {
			System.out.println(st);
		}
		for(Integer st:list1) {
			System.out.println(st);
		}
		for(String st:list2) {
			System.out.println(st);
		}		
	}

}
