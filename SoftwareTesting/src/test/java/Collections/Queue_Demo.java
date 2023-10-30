package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue_Demo {

	public static void main(String[] args) {

		//How to Declare ArrayList
		PriorityQueue pq=new PriorityQueue();
		
		//Adding values to ArrayList(add--offer)
		pq.add("A");  //0
		pq.add("B");  //1
		pq.add("C");  //2
		pq.add("D");  //3
		pq.offer("D"); //4
		
		
		System.out.println(pq);
		
		//Get Head Element  element(),peek()
		System.out.println(pq.element());//A If empty return No such element exception
		System.out.println(pq.peek());//A   If empty return null
		
		//Remove an element  (remove--poll)
		System.out.println(pq.remove());//A
		System.out.println(pq);
		
		
		System.out.println(pq.poll());//B
		System.out.println(pq);
		
		//Iterative
		Iterator itr=pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		for(Object ele:pq) {
			System.out.println(ele);
		}
	}

}
