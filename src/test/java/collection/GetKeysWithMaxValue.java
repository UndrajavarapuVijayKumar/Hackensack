package collection;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GetKeysWithMaxValue {
	public static void main(String[] args) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		map.put('c', 5);
		map.put('a', 5);
		map.put('b', 3);
		
		System.out.println(Collections.max(map.values()));
		int max =Collections.max(map.values());
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()==max) {
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
		}
	}
}	
