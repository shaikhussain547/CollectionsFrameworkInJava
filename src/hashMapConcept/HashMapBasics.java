package hashMapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		
		//No order -- no indexing
		// stores values -- Key, value <k, v>
		// key can not be duplicate
		//can store n number of null values but only one null key
		//hashmap is not thread-safe
		
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London11"); //overridden the value of London
		capitalMap.put(null, "Berlin");
//		capitalMap.put(null, "LA"); //overridden the value of Berlin
		capitalMap.put("Russia", null);
		capitalMap.put("France", null);
		capitalMap.remove(null);
		
		//fetch the value :
		System.out.println(capitalMap.get("USA"));
		System.out.println(capitalMap.get("Germany")); //null
		System.out.println(capitalMap.get("UK")); //London11
		System.out.println(capitalMap.get(null)); //Berlin
		System.out.println(capitalMap.get("Russia")); //null
		System.out.println(capitalMap.get("France")); //null
		
		
		//iterator: over the keys : by using keySet()
		Iterator<String> it = capitalMap.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println("key = "+key+", value = "+value);
		}
		
		//iterator: over the set (pair) : by using entryset()
		Iterator<Entry<String, String>> it1 = capitalMap.entrySet().iterator();
		
		while(it1.hasNext()) {
			Entry<String, String> entry = it1.next();
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
		
		//iterator hashmap using java 8 for each and lambda:
		capitalMap.forEach((k,v) -> System.out.println(k +" = "+v));
		
		
		
		
	}

}
