package uppe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
	public static void main(String[] args) {
		String input = "codexxcodexxcode";
		Pattern pat = Pattern.compile("code");
		Matcher mat = pat.matcher(input);
		
		int count =0;
		while(mat.find()) {
			count++;
		}
		System.out.println(count);
	}
}
