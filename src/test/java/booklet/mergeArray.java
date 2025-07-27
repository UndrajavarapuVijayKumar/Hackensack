package booklet;

import java.util.Arrays;

public class mergeArray {
	public static void main(String[] args) {
		int[] arr1 = {1,3,5};
		int[] arr2 = {2,4,6};
		
		int[] merged =  new int [arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			merged[i]=arr1[i];
		}
		for(int j=0;j<arr2.length;j++) {
			merged[arr1.length+j]=arr2[j];
			
		}
		Arrays.sort(merged);
		System.out.println(Arrays.toString(merged));
		System.out.println(Arrays.equals(arr1, arr2));
	}
}
