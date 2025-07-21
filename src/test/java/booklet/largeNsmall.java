package booklet;

public class largeNsmall {
	public static void main(String[] args) {
		int[] arr = {4,3,12,55,312,121,1211,11,12};
		int max =arr[0];
		int min = arr[0];
		int indexMax=0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				indexMax=i;
			}else if(arr[i]>max) {
				max=arr[i];

			}
		}
		System.out.println(max+ " Index : "+ indexMax);
		System.out.println(min);
	}
}
