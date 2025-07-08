package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class removeEntriesfromMap {
	public static void main(String[] args) {
		Map<Integer,String> map = new LinkedHashMap<>();
			map.put(101, "abcs");
			map.put(102, "abcs");
			map.put(103, "abcs");
			map.put(105, "abcs");
			map.put(101, "zxzx");
			
		System.out.println(map);
		
		map.remove(101);
		System.out.println(map);
	}
}
