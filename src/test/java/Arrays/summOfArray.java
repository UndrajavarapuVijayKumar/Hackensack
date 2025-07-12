package Arrays;

public class summOfArray {
	public static void main(String[] args) {
		int[] arr= {3,4,6,2,4,7};
		
		int sum=0;
		
		for(int num:arr) {
			sum=sum+num;
		}
		System.out.println(sum);
	}
}
