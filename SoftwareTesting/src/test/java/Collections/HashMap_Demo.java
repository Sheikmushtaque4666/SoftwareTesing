package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Demo {

	public static void main(String[] args) {
		
		//How to Declare ArrayList
		//HashMap hm=new HashMap();
		HashMap <Integer,String> hm=new HashMap<Integer,String>();
		
		//Adding values to ArrayList
		hm.put(101,"Bobby");
		hm.put(102,"Gandhi");
		hm.put(103,"Munna");
		hm.put(104,"Chinna");
		hm.put(105,"Kanna");
		hm.put(105,"Kanna");//Key cannot be duplicate
		hm.put(106,"Kanna");//Value can be duplicate
		//hm.put(null,"ABC");
		//hm.put(107,null);
		//hm.put(108,null);

		System.out.println(hm);
		
		System.out.println(hm.get(102));//Gandhi
		
		//remove() an element
		hm.remove(105);
		System.out.println(hm);
		
		//Contains()--->return boolean values
		System.out.println(hm.containsKey(101));//true
		System.out.println(hm.containsKey(105));//false
		
		System.out.println(hm.containsValue("Chinna"));//true
		System.out.println(hm.containsValue("Kanna"));//true
		
		//KeySet()--->return all the keys as set
		System.out.println(hm.keySet());
		
		for(int i:hm.keySet()) {
			System.out.println(i);
		}
		
		//values()--->return all the values as collection
		System.out.println(hm.values());
		
		for(String s:hm.values()) {
			System.out.println(s);
		}
		
		//entrySet()--->return all the entries as set
		System.out.println(hm.entrySet());
		
		//both key+values
		for(Object o:hm.keySet()) {
			System.out.println(o+ " "+hm.get(o));
		}
		
		//Entry methods
		
		for(Map.Entry entry:hm.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		//iterator()
		
		Set s=hm.entrySet();
		
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			Map.Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
	}

}
