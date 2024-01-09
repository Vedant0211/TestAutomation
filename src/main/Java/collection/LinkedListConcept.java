package collection;

import java.util.Iterator;
import java.util.LinkedList;

import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("testing0");
		ll.add("testing1");
		ll.add("testing2");
		ll.add("testing3");
		ll.add("testing4");
		System.out.println("content of linkedList:"+ll);
		ll.addFirst("test");
		ll.addLast("asdsa");
		System.out.println("content of linkedList:"+ll);
		//get
		System.out.println(ll.get(0));
		ll.set(1, "vedant");
		System.out.println(ll.get(1));
		//remove first and last
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linkedList:"+ll);
		ll.remove(2);
		System.out.println("content of linkedList:"+ll);
		//how to print all the value --for loop,adv loop,iterator,while loop
		//for loop
		System.out.println("********************for loop*********************");
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		//Advance for loop
		System.out.println("********************advance for loop*********************");
		for(String str : ll) {
			System.out.println(str);
		}
		//iterator
		System.out.println("********************Iterator*********************");
		Iterator<String> it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//while loop
		System.out.println("********************while loop*********************");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		
		
		
		
		
		
		
	}

}
