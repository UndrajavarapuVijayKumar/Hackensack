package booklet;

public class removeDuplicates {
	public static void main(String[] args) {
		int[] arr = {2,2,34,21,12,33,121,54,3,3,3,2,1,4,2,2};
		int unique= 0;
		for(int i=0;i<arr.length;i++) {
			int count=0;			//Reset count for each i
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(arr[i]);
			}
		}
		
	}
}
