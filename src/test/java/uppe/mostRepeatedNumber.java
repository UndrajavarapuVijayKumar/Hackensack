package uppe;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mostRepeatedNumber {
	public static void main(String[] args) {
		int[] arr ={2,3,5,6,2,8,3,2,7,8} ;
		
		/*
		 * HashMap<Integer,Integer> map = new HashMap<>();
		 * 
		 * for(int i : arr) { map.put(i, map.getOrDefault(i, 0)+1); }
		 * for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
		 * System.out.println(entry.getKey()+ " : "+entry.getValue()); }
		 * 
		 */
		
		int maxcount=0;
		int mostrepeated=0;
		
		for(int i=0;i<arr.length;i++) {
			int count =0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>maxcount) {
				maxcount=count;
				mostrepeated=arr[i];
			}
		}
		System.out.println(mostrepeated);
		System.out.println(maxcount);
		
		
		
		
		
		
	}
}
