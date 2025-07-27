package booklet;

public class NonRepeated {
	public static void main(String[] args) {
		int[] arr = {3,3,2,1,3,1,2,3,4,5,3};
		
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			int count =0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(arr[i] );
				System.out.println("first index of nonrepeated: "+ i);
				break;
			}
		}
	}
}
