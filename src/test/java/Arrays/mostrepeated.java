package Arrays;

public class mostrepeated {
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,2,3,4,2,3,2,2,2,4};
		int mostrepeated =0;int maxcount = 0;int second=0;
		/*
		 * for(int i =0;i<arr.length;i++) { int count=0; for(int j=0;j<arr.length;j++) {
		 * if(arr[i]==arr[j]) { count++; } } if(count==1 ) { maxcount=count;
		 * mostrepeated=arr[i]; // System.out.println(arr[i]); } //
		 * System.out.println(arr[i]+ " occurs "+count); }
		 */
		
		int max=Integer.MIN_VALUE;
		
		for(int num:arr) {
			if(num>max) {
				second=max;
				max=num;
			}
			else if(second!=max) {
				System.out.println(second);
			}
		}
	}
}
