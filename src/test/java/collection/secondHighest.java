package collection;

public class secondHighest {
	public static void main(String[] args) {
		int[]numbers = {2,22,245,543,12,122};
		int first = Integer.MIN_VALUE;
		System.out.println(first);
		int second = Integer.MIN_VALUE;
		for(int num: numbers) {
			if(num>first) {
				second=first;
				first=num;
			}else if(num>second) {
				second=num;
			}
		}
		System.out.println(second);
	}
}
