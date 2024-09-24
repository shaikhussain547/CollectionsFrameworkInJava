package ListConcept;

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
		
		//1. Using HashMap class
		
		HashMap<String, String> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();
		
		//2. Static way : Static hashmap :
		System.out.println(HashMapInitialization.marksMap.get("A"));
		
		//3. immutableMap with only one single entry :
		Map<String, Integer> map3 = Collections.singletonMap("test", 100);
		System.out.println(map3.get("test"));
//		map3.put("abc", 200);	//UnsupportedOperationException
		
		
		//4. JDK 8 :
		//creating one 2D array of Strings using Stream and collecting in the form Map
		Map<String, String> map4 = Stream.of(new String [] [] {
			{"Tom", "A Grade"},
			{"Naveen", "A+ Grade"},
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		
		System.out.println(map4.get("Tom"));
		map4.put("Lisa", "A++ Grade");
		System.out.println(map4.get("Lisa"));
		
		
		//5. Using SimpleEntry method: Mutuble map :
		Map<String, String> map5 = Stream.of(
				new AbstractMap.SimpleEntry<>("Naveen", "Java"),
				new AbstractMap.SimpleEntry<>("Tom", "Python")
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(map5.get("Naveen"));
		map5.put("Lisa", "C#");	
		
		//6. Using SimpleEntry method: Immutuble map :
		Map<String, String> map6 = Stream.of(
				new AbstractMap.SimpleEntry<>("Naveen", "Java"),
				new AbstractMap.SimpleEntry<>("Tom", "Python")
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
				
		System.out.println(map6.get("Tom"));
		map6.put("Steve", "Ruby");
		System.out.println(map6.get("Steve"));
		
		//JDK 1.9 :
		//Empty map:
		Map<String, String> emptyMap = Map.of();
//		emptyMap.put("Tom", "Python");
//		System.out.println(emptyMap.get("Tom"));	//UnsupportedOperationException
		
		
		//Singleton Map:
		Map<String, String> singletonMap = Map.of("k1", "v1");
		System.out.println(singletonMap.get("k1"));
//		singletonMap.put("k2", "v2");//UnsupportedOperationException
		
		
		//Multi values Map: Max 10 pairs can be stored:
		Map<String, String> multiMap = Map.of("k1", "v1", "k2", "v2", "k3", "v3");
		System.out.println(multiMap.get("k3"));
		
		//of Entries method : no limitations on pairs (key - value)
		//Immutable Maps:
		Map<String, Integer> map7 = Map.ofEntries(
				new AbstractMap.SimpleEntry<>("A", 100),
				new AbstractMap.SimpleEntry<>("B", 200),
				new AbstractMap.SimpleEntry<>("C", 300)
				);
		System.out.println(map7.get("C"));
//		map7.put("D", 400);//UnsupportedOperationException
		
		
		//map using Guava:
		//Map<String, String> titleMaps = Immutable	Map.of("k1", "v1", "k2", "v2", "k3", "v3");
		
		
	}

}
