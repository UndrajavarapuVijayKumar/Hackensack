package Bas2Int;

import java.util.HashMap;
import java.util.Map.Entry;

public class frequency {
	public static void main(String[] args) {
		int[] arr = {2,3,4,2,1,2,4,5,8,9};
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i :arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		for(Entry<Integer,Integer> entry :map.entrySet()) {
			System.out.println(entry.getKey() + " : "+entry.getValue());
		}
	}
}