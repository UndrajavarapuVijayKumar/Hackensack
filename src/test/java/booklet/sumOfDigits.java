package booklet;

public class sumOfDigits {
	public static void main(String[] args) {
		int n = 123123; int sum=0;
		while(n>0){
			sum+=n%10;
			n=n/10;
		}
		System.out.println(sum);
	}
}
