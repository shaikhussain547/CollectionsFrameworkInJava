package hashMapConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");
		
		System.out.println(map1); //{1=A, 2=B, 3=C}
		System.out.println(map2); //{1=A, 2=B, 3=C}
		System.out.println(map3); //{1=A, 2=B, 3=D}
		
		//1. On the basis of key-value: use equal method:
		System.out.println(map1.equals(map2)); //true -- order doesn't matter
		System.out.println(map1.equals(map3)); //false
		
		//2. compare hashmaps for the same keys: keySet():
		System.out.println(map1.keySet().equals(map2.keySet())); //true
		System.out.println(map1.keySet().equals(map3.keySet())); //true
		
		//3. find out the extra keys:
		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");
		
		//combine the keys from both the hashmaps: using HashSet:
		HashSet<Integer> combineKeys = new HashSet<Integer>(map1.keySet());
		//add the keyset from map4:
		combineKeys.addAll(map4.keySet());
		combineKeys.removeAll(map1.keySet());
		System.out.println(combineKeys); //[4]
		
		//4. compare maps by values: duplicates are not allowed:
		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");
		map5.put(4, "C");
		System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map2.values()))); //true
		System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map5.values()))); //false
		
		//duplicates are allowed: using HashSet
		System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map2.values()))); //true
		System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map5.values()))); //true
		
		
	}

}
