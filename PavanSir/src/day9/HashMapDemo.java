package day9;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//1.Declaration of HashMap
		
		//HashMap hm=new HashMap();
		HashMap<Integer,String> hm=new HashMap<Integer,String>();	
		
		//2.Adding pairs to HashMap
		hm.put(101,"Bobby");
		hm.put(102,"Gandhi");
		hm.put(103,"Munna");
		hm.put(104,"Chinna");
		hm.put(105,"Kanna");
		
		System.out.println(hm);
		
		//3.Remove a pair from HashMap
		hm.remove(103);
		System.out.println("After removing a pair:"+hm);
		
		//4.Reading pairs using for loop[
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
