package getOrDefault;

import java.util.HashMap;
import java.util.Map;

public class basic {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("vijay", 95);
		map.put("satish", 90);
		
		int vijays =map.getOrDefault("vijay", 0);
		int ravs=map.getOrDefault("ravi", 20);
		
		System.out.println(ravs+" & vijays: "+vijays);
	}
}
