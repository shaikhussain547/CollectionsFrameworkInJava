package treeMapConcept;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(1000, "Tom");
		map.put(2000, "Peter");
		map.put(3000, "Steve");
		map.put(11000, "John");
		map.put(1400, "Robby");
		
		System.out.println(map); //{1000=Tom, 1400=Robby, 2000=Peter, 3000=Steve, 11000=John}
		
		map.forEach((k,v) -> System.out.println("Key = "+k+", value = "+v));
		
		System.out.println(map.lastKey()); //11000
		System.out.println(map.firstKey());  //1000
		
		Set<Integer> keyLessThan3k = map.headMap(3000).keySet();
		System.out.println(keyLessThan3k); //[1000, 1400, 2000]
		
		Set<Integer> keyGr3k = map.tailMap(3000).keySet();
		System.out.println(keyGr3k); //[3000, 11000]
		
		
		
		
		
		
		
		
	}

}
