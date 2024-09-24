package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		
		//It is similar to HashMap, but it is synchronised.
		//stores the value on the basis of key-value.
		//key --> Object -- HashCode --> Value.
		
		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "Selenium");
		
		//create a clone copy/shallow copy :
		
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable)h1.clone();
		
		System.out.println("The values from h1 "+h1);
		System.out.println("The values from h2 "+h2);
		
		h1.clear();
		
		System.out.println("The values from h1 "+h1);
		System.out.println("The values from h2 "+h2);
		
		//contains value :
		
		Hashtable st = new Hashtable();
		st.put("A", "Naveen");
		st.put("B", "Manager");
		st.put("C", "Selenium");
		
		if(st.contains("Naveen"))
			System.out.println("Value is found");
		
		//print all the values from Hashtable using -- Enumeration  -- elements()
		
		Enumeration e = st.elements();
		System.out.println("Print values from st using enumeration ");
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//get all the values from hashtable using -- entrySet() -- set of hashtable values :
		System.out.println("Print values from st using entry set ");
		
		Set s = st.entrySet();
		System.out.println(s);
		
		//check both the hashtables are equal or not :
		Hashtable st1 = new Hashtable();
		st1.put("A", "Naveen");
		st1.put("B", "Manager");
		st1.put("C", "Selenium");
		//no null key and null values -- (null pointer exception)
		//it contains only unique values
		
		if(st.equals(st1))
		System.out.println("Both are equal");
		
		//Get the values from a key:
		System.out.println(st1.get("A"));
		
		//get the hashcode of hashtable object :
		System.out.println("the hashcode value of st1: "+st1.hashCode());
		
		//generics
		Hashtable<String, String> st3 = new Hashtable<String, String>();
		
		
		
	}
}
