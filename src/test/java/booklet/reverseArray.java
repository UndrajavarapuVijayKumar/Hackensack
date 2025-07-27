package booklet;

import java.util.Arrays;

public class reverseArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		int[] reverse = new int [arr.length];
		for(int i=0;i<arr.length;i++) {
			reverse[i]=arr[arr.length-1-i];
		}
		System.out.println(Arrays.toString(reverse));
	}
}


/*
 * At i = 0, you want the last element → arr[4] = arr[arr.length - 1 - 0]
 * 
 * At i = 1, you want the second-last → arr[3] = arr[arr.length - 1 - 1]
 * 
 * At i = 2, you want the middle → arr[2] = arr[arr.length - 1 - 2]
 */