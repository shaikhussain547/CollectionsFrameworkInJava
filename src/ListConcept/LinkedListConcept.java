package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//add:
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		//Print:
		System.out.println("Content of linkedlist: "+ll); //[test, qtp, selenium, RPA, RFT]
		
		//addfirst:
		ll.addFirst("Naveen");
		//addlast:
		ll.addLast("Automation");
		
		System.out.println("Content of linkedlist: "+ll);
		
		//get:
		System.out.println(ll.get(0));
		//set:
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		
		//remove : frist and last element.
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Content of linkedlist: "+ll);
		
		ll.remove(2);
		System.out.println("Content of linkedlist: "+ll);
		
		//How to print all the values of LinkedList:
		//1. For loop :
		System.out.println("***********Using for loop***********");
		for(int n=0; n<ll.size(); n++) {
			System.out.println(ll.get(n));
		}
		
		//2. Advance for loop :
		System.out.println("***********Using advance for loop***********");
		for(String str : ll) {
			System.out.println(str);
		}
		
		//3. Iterator :
		System.out.println("***********Using Iterator***********");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//4. While loop :
		System.out.println("***********Using While loop***********");
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		
		
	}

}
