package hashMapConcept;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {
	
	public static Map<String, Integer> marksMap;
	
	static {
		marksMap = new HashMap<>();
		marksMap.put("A", 100);
		marksMap.put("B", 200);
	}

	public static void main(String[] args) {
		
		//1. using hashMap class
		HashMap<String, String> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();
		
		//2. static way : statich hashmap:
		System.out.println(HashMapInitialization.marksMap.get("B"));
		
		//3. immutableMap with only single entry:
		Map<String, Integer> map3 = Collections.singletonMap("test", 250);
		System.out.println(map3.get("test"));
//		map3.put("abc", 350); //UnsupportedOperationException
		
		//4. JDK 8:
		Map<String, String> map4 = Stream.of(new String[][] {
			{"Tom", "A grade"},
			{"Robby", "B grade"},
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		
		System.out.println(map4.get("Robby"));
		map4.put("Lisa", "A++ grade");
		System.out.println(map4.get("Lisa"));
		
		
		//using SimpleEntry: Immutable map:
		Map<String, String> map5 = Stream.of(
						new AbstractMap.SimpleEntry<>("Program", "C++"),
						new AbstractMap.SimpleEntry<>("Code", "Java")
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(map5.get("Code"));
		map5.put("Script", "python");
		System.out.println(map5.get("Script"));
		
		//JDK 1.9:
		//empty map:
		Map<String, String> emptyMap = Map.of();
//		emptyMap.put("Tom", "python");
//		System.out.println(emptyMap.get("Tom")); //UnsupportedOperationException
		
		//Singleton map:
		Map<String, String> singtonMap = Map.of("k1", "v1");
		System.out.println(singtonMap.get("k1"));
//		singtonMap.put("k2", "v2"); //UnsupportedOperationException
		
		//Multi values map: max 10 pairs can be stored:
		Map<String, String> multiMap = Map.of("k1", "v1","k2", "v2","k3", "v3");
		System.out.println(multiMap.get("k3"));
		
		//OfEntries method: no limitations on pairs (key - value)
		//Immutable : Not able to add more values after map creation
		Map<String, Integer> map6 = Map.ofEntries(
					new AbstractMap.SimpleEntry<>("A", 101),
					new AbstractMap.SimpleEntry<>("B", 201),
					new AbstractMap.SimpleEntry<>("C", 301)
				);
		
		System.out.println(map6.get("C"));
//		map6.put("D", 401); //UnsupportedOperationException
		
		
		//maps suing Guava:
		
		
		
		
	}

}
