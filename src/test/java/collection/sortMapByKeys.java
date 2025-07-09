package collection;

import java.util.Map;
import java.util.TreeMap;

public class sortMapByKeys {
	public static void main(String[] args) {
		Map<Integer,String> map = new TreeMap<>();
		map.put(101, "abcs");
		map.put(102, "abcs");
		map.put(103, "abcs");
		map.put(105, "abcs");
		map.put(101, "zxzx");
		System.out.println(map);
		
		
	}
}
