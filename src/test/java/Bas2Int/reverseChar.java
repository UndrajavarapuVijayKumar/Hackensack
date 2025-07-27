package Bas2Int;

public class reverseChar {
	public static void main(String[] args) {
		String s1 = "hello world";
	
		s1=s1.replace(" ", "");
		char[] ch = s1.toCharArray();
		char[] reverse = new char[ch.length];
		for(char s = 0; s<ch.length;s++) {
			reverse[s] = ch[ch.length-1-s];
			
		}
		System.out.println(reverse);
		
	}
}
