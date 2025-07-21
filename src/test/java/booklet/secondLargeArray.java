package booklet;

public class secondLargeArray {
	public static void main(String[] args) {
		int[] arr = {4,3,12,55,312,121,1211,11,12};
		int min = Integer.MIN_VALUE;int second=0;
		for(int i :arr) {
			if(i>min) {
				second=min;
				min=i;
				
			}
		}
		System.out.println(second);
	}
}
