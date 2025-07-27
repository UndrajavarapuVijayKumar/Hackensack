package booklet;

import java.util.Arrays;
import java.util.Collections;

import java.util.List;

public class reverseArrayColle {
	public static void main(String[] args) {
		int[] arr = {3,2,1};
		Integer[] arrInt = new Integer[arr.length];
		for(int i=0;i<arr.length;i++) {
			arrInt[i]=arr[i];
		}
		List l1 = Arrays.asList(arrInt);
		Collections.reverse(l1);
		
		System.out.println(l1);
	}
}
