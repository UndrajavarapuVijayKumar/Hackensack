package Bas2Int;

public class maxMin {

	public static void main(String[] args) {
		int [] arr = {2,3,5,6,2,8,3,2,7,8};
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i : arr) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min + " : "+max);
	}

}
