package Arrays;

public class sumOfOdds {
	public static void main(String[] args) {
		int[] arr = {2,1,642,12,321,423,12,223};
		int sum=0;
		for(int i:arr) {
			if(i%2!=0) {
				System.out.print(i + ",");
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}
