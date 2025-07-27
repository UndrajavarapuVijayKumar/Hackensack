package booklet;

import java.util.Arrays;

public class merge2 {
	public static void main(String[] args) {
		int[] a1 = {1,2,3};
		int[] a2 = {6,5,4};
		
		int[] merged = new int[a1.length +a2.length];
		
		for(int i=0;i<a1.length;i++) {
			merged[i]=a1[i];
		}
		for(int i=0;i<a2.length;i++) {
			merged[a1.length+i]=a2[i];
		}
		for(int i:merged) {
			System.out.println(i);
		}
		Arrays.sort(merged);
		for(int i:merged) {
			System.out.print(i);
		}
	}
}
