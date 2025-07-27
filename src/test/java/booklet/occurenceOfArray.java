package booklet;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class occurenceOfArray {
	public static void main(String[] args) {
		int[] arr = {2,3,3,4,1,2,2,2,4,42,1,3};
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i:arr) {
			map.put(i,map.getOrDefault(i, 0)+1);			
		}
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " : "+entry.getValue());
		}
	}
}
