package hashMapConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapToArrayList {

	public static void main(String[] args) {
		
		HashMap<String, Integer> compMap = new HashMap<>();
		compMap.put("Google", 10000);
		compMap.put("Walmart", 20000);
		compMap.put("Amazon", 30000);
		compMap.put("Facebook", 50000);
		compMap.put("Cisco", 15000);
		
		System.out.println("compMap size: "+compMap.size()); //5
		
		Iterator it = compMap.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry pairs = (Map.Entry)it.next();
			System.out.println(pairs.getKey()+" = "+pairs.getValue());
		}
		
		//convert hashmap keys into ArrayList:
		List<String> compNamesList = new ArrayList<String>(compMap.keySet());
		System.out.println(compNamesList); //[Google, Walmart, Cisco, Amazon, Facebook]
		for(String t : compNamesList) {
			System.out.println(t);
		}
		
		//convert hashmap values into ArrayList:
		List<Integer> empValuesList = new ArrayList<Integer>(compMap.values());
		
		for(Integer e : empValuesList) {
			System.out.println(e);
		}
		
		
		
		
	}

}
