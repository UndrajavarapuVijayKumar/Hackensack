package patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hashtag {
	public static void main(String[] args) {
		String tweet = "Loving the #Java and #AutomationTesting life!";
		Pattern pattern = Pattern.compile("#\\w+");
		Matcher matcher = pattern.matcher(tweet);

		while (matcher.find()) {
		    System.out.println("Hashtag: " + matcher.group());
		}

	}
}
