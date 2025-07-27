package Bas2Int;

import java.util.Arrays;

public class reverseArra {

	public static void main(String[] args) {
		int [] arr = {2,3,5,6,2,8,3,2,7,8};
		int[] reverse = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			reverse[i]=arr[arr.length-1-i];
		}
		System.out.println(Arrays.toString(reverse));
	}

}
