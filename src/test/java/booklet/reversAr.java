package booklet;

import java.util.Arrays;
import java.util.TreeSet;

public class reversAr {
	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1};
		int[] reverse = new int [arr.length];
		for(int i=0;i<arr.length;i++) {
			reverse[i]=arr[arr.length-1-i];
		}
		System.out.println(Arrays.toString(reverse));
		
		
		Integer[] newIn = new Integer[arr.length];
		for(int i=0;i<arr.length;i++) {
			newIn[i]=arr[i];
		}
		TreeSet<Integer> sortt=new TreeSet<Integer>();
		for(Integer n : newIn) {
			sortt.add(n);
		}
		System.out.println(sortt);
	}
}
