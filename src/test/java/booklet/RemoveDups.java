package booklet;

import java.util.HashSet;
import java.util.Set;

public class RemoveDups {
	public static void main(String[] args) {
		int[] arr = {3,3,2,1,3,1,2,3,4,5,3};
		
		
		Set<Integer> dups = new HashSet<>();
		for(int i: arr) {
			dups.add(i);
		}
		System.out.println(dups);
	}
}
