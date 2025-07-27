package uppe;

import java.util.HashSet;
import java.util.Set;

public class removeDups {
	public static void main(String[] args) {
		int[] arr ={1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
		
		Set<Integer> removeDuplicates = new HashSet();
		for(int i : arr) {
		removeDuplicates.add(i);
		}
		System.out.println(removeDuplicates);
		
		
		
		
		
		
	}
}
