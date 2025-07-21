package booklet;

public class IndexOf {
	public static void main(String[] args) {
		int[] arr = {4,3,12,55,312,121,1211,11,12};
		int max=0, index=0,second=0;
		for(int i =0; i<arr.length;i++) {
			if(arr[i]>max) {
				second=max;
				max=arr[i];
				index=i;
				
			}
		}
		System.out.println("first highest number in array: "+max);
		System.out.println("and its index: "+index);
		System.out.println("second highest number in array: " + second);
	}
}
