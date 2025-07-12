package collection;

import java.util.HashMap;
import java.util.Map;

public class mostrepeated {
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,2,8,3,2,7,8};
		Map<Integer,Integer> freqMap = new HashMap<>();
		for(int nums:arr) {
			freqMap.put(nums, freqMap.getOrDefault(nums, 0)+1);
		}
		System.out.println(freqMap);
	}
}
