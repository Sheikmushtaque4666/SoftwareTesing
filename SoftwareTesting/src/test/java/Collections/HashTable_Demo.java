package Collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashTable_Demo {

	public static void main(String[] args) {
		//Hashtable ht=new Hashtable();
		Hashtable <Integer,String> ht=new Hashtable<Integer,String>();
		
		//Adding values to ArrayList
		ht.put(101,"Bobby");
		ht.put(102,"Gandhi");
		ht.put(103,"Munna");
		ht.put(104,"Chinna");
		//ht.put(null,"X"); Null key not allowed
		//ht.put(105,null); Null values not allowed
		//ht.put(104,"Kanna");
		//ht.put(105,"Chinna");

		System.out.println(ht);
		
		//get
		System.out.println(ht.get(103));
		
		//remove
		ht.remove(104);
		System.out.println(ht);
		
		//Contains()--->return boolean values
		System.out.println(ht.containsKey(101));//true
		System.out.println(ht.containsKey(105));//false
				
		System.out.println(ht.containsValue("Munna"));//true
		System.out.println(ht.containsValue("Kanna"));//fasle
		
		//KeySet(),values()--->return all the keys as set
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		
		for(int i:ht.keySet()) {
			System.out.println(i);
		}
		
		for(String s:ht.values()) {
			System.out.println(s);
		}
		
		//both key+values
		for(int k:ht.keySet()) {
			System.out.println(k+ " "+ht.get(k));
		}
		
		//Entry methods
		
		for(Map.Entry entry:ht.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
				
		//iterator()
				
		Set s=ht.entrySet();
				
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
		//System.out.println(itr.next());
		Map.Entry entry=(Entry) itr.next();
		System.out.println(entry.getKey()+" "+entry.getValue());
					
		}
		
	}

}
