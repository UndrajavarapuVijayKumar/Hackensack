package uppe;

public class mostrepeatedChar {
	public static void main(String[] args) {
		String s1 = "engineer";
		char[] arr = s1.toCharArray();
		
		char mostrepeated = arr[0];
		int maxcount = 0;
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>maxcount) {
				maxcount=count;
				mostrepeated=arr[0];
			}
		}
		System.out.println(mostrepeated);
		System.out.println(maxcount);
	}
}
