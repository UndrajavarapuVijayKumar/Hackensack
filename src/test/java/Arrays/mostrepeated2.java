package Arrays;

public class mostrepeated2 {
	public static void main(String[] args) {
		int[] arr = {2,3,4,2,3,1,2,5,6,89,2};
		
		int mostrepeated =0;
		int count=0;int maxcount=0;
		
		int first=0; int second=0;
		
		for(int i =0;i<arr.length;i++) {
			count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>maxcount) {
				maxcount=count;
				mostrepeated=arr[i];
//				System.out.println(arr[i]);
//				System.out.println(maxcount);
			}
			if(arr[i]>first) {
				second=first;
				first=i;
			}
			else if(i!=first) {
				second=i;
			}
		}
		System.out.println(second);
		
		
		/*
		 * for(int i:arr) { if(arr[i]==9) System.out.println("9 is there"); else
		 * System.out.println("9 is no there"); }
		 */
	}
}

//BELOW IS THE CORRECT CODE

/*
 * import java.util.*;
 * 
 * public class FindValues { public static void main(String[] args) { int[] arr
 * = {2,3,4,2,3,1,2,5,6,89,2};
 * 
 * // Find most repeated element Map<Integer, Integer> freqMap = new
 * HashMap<>(); for(int num : arr) { freqMap.put(num, freqMap.getOrDefault(num,
 * 0) + 1); }
 * 
 * int mostRepeated = arr[0]; int maxCount = 0; for(Map.Entry<Integer, Integer>
 * entry : freqMap.entrySet()) { if(entry.getValue() > maxCount) { maxCount =
 * entry.getValue(); mostRepeated = entry.getKey(); } }
 * 
 * System.out.println("Most repeated element: " + mostRepeated + " (repeats " +
 * maxCount + " times)");
 * 
 * // Find second max int first = Integer.MIN_VALUE; int second =
 * Integer.MIN_VALUE;
 * 
 * for(int num : arr) { if(num > first) { second = first; first = num; } else
 * if(num > second && num != first) { second = num; } }
 * 
 * if(second == Integer.MIN_VALUE) {
 * System.out.println("No second largest element."); } else {
 * System.out.println("Second largest element: " + second); } } }
 */