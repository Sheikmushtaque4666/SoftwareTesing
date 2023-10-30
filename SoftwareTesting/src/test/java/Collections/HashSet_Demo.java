package Collections;

import java.util.HashSet;

public class HashSet_Demo {

	public static void main(String[] args) {
		
		//How to Declare ArrayList
		HashSet hs=new HashSet();
		HashSet<String> hss=new HashSet<String>();
		HashSet<Integer> hsi=new HashSet<Integer>();
		
		//Adding values to ArrayList
		hs.add("Bobby");  //0
		hs.add("Gandhi"); //1
		hs.add("Munna");  //2
		hs.add("Chinna"); //3
		hs.add("Kanna");  //4
		hs.add("Kanna");  //5
		hs.add("Kanna");  //6
		hs.add(null);     //7
		hsi.add(8);     //8

		System.out.println(hs);

		//Size of ArrayList
	    System.out.println(hs.size());//6
				
		//Remove an element 
		hs.remove("Kanna");
		System.out.println(hs);
		
		//Insert a new element into array list
		hs.add("Bujji");
		System.out.println(hs.size());//6
		System.out.println("After Adding new Element:"+hs);
				
		//Read values from ArrayList using for loop
		for(Object st:hs) {
			System.out.println(st);
		}
		for(Integer st:hsi) {
			System.out.println(st);
		}


		


		
		

	}

}
