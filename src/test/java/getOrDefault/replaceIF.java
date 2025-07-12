package getOrDefault;

import java.util.HashMap;
import java.util.Map;

public class replaceIF {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("IN","Delhi");
		map.put("US", "Texas");
		
		
				//tRADITIONAL
		String city;
		if(map.containsKey("UK")) {
			city=map.get("UK");
		}else {
			city="unkown";
		}
		
		System.out.println(city);
		
		
				//using getOrDefault
		
		System.out.println(map.getOrDefault("UK", "unkonw"));
		
		
		
		
		
	}
}
