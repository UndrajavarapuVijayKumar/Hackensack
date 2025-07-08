package collection;

import java.util.HashMap;
import java.util.Map;

public class maps {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "vijay");
		map.put(102, "satish");
	
		
		System.out.println(map.get(102));
		
	}
}
