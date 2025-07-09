package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class checkTwoMapsEqual {
	public static void main(String[] args) {
		
		Map<Integer,String> map1 = new LinkedHashMap();
			map1.put(101, "vijay");
			map1.put(102,"satish");
		
		Map<Integer,String> map2 = new LinkedHashMap();
			map2.put(101, "vijay");
			map2.put(102,"satish");
		
			if(map1.equals(map2)) {
				System.out.println("matches!");
			}
			
	}
}
