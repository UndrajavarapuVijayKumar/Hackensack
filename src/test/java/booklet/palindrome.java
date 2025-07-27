package booklet;

public class palindrome {
	public static void main(String[] args) {
		int[] arr = {1,2,2,4,5,2,1};
		boolean isPalindrome =true;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr[arr.length-1-i]) {
				isPalindrome=false;
				break;
			}
		}
		if(isPalindrome) {
			System.out.println("This given array is palindrome!");
		}
		else {
			System.out.println("this is not a palindrome!");
		}
	}
}
