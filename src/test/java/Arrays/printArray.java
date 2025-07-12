package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class printArray {
	public static void main(String[] args) {
		int[] arr = {2,2,21,1,21,12};
		
		System.out.println(Arrays.toString(arr));
				
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i:arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		System.out.println(map);
		
		
		
	}
}
