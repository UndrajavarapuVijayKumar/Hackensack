package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class maps {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "vijay");
		map.put(102, "satish");
	
		System.out.println(map);
		System.out.println("Map size: "+map.size());
		System.out.println(map.get(102));
		System.out.println(map.getOrDefault(103,"get or default"));
		
		if(map.get(101).equals("vijay")) {
			System.out.println("matched!");
		}else {
			System.out.println("not matched");
		}
//		map.remove(102);
//		System.out.println(map);
		
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
	}
}
