package booklet;

public class TotalOccurencOfOdds {
	public static void main(String[] args) {
		int count=0;
		for(int i=0;i<=100;i++) {
			if(i%2!=0) {
				count++;
			}
		}
		System.out.println("odd numbers occurs: "+count+ " times");
	}
}
