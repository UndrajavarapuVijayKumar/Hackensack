package Bas2Int;

public class palindrome {
	public static void main(String[] args) {
		int[] arr = {1,2,3,2,1};
		boolean isPlaindrome =true;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]!=arr[arr.length-1-i]) {
				isPlaindrome=false;
				break;
			}
			
		}
		if(isPlaindrome) {
			System.out.println("isPalindrom!");
		}
		else {
			System.out.println("is not palindrome!");
		}
	}
}
