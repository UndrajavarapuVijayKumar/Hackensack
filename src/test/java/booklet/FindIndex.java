package booklet;

public class FindIndex {
	public static void main(String[] args) {
		int[] arr = {4,3,12,55,312,121,1211,11,12};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==121) {
				System.out.println(i);
			}
		}
	}
}
