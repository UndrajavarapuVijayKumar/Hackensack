package booklet;

public class firstLargestNoArray {
	public static void main(String[] args) {
		int[] arr = {4,3,12,55,312,121,1211,11,12};
		int max=Integer.MAX_VALUE;
		int min=Integer.MIN_VALUE;
		int first;
		for(int i :arr) {
			if(i>min) {
				min=i;
			}
		}
		System.out.println(min);
	}
}
