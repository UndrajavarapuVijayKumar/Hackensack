package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class secHighestWord {
	public static void main(String[] args) {
		String str = "hello world, hello java, Hello VIjay, Welcome to java";
		str = str.toLowerCase();
		str = str.replaceAll(",", " ");
		String[] arr = str.split(" ");
		System.out.println(arr);

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (String words : arr) {
			if (!words.isEmpty()) {
				map.put(words, map.getOrDefault(words, 0) + 1);

			}
		}
		System.out.println(map);

		System.out.println();

		int firstFreq = 0, secondFreq = 0;
		String firstWord = "", secondWord = "";

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
			int freq = entry.getValue();
			String word = entry.getKey();

			if (freq > firstFreq) {
				secondFreq = firstFreq;
				secondWord = firstWord;

				firstFreq = freq;
				firstWord = word;
			} else if (freq > secondFreq) {
				secondFreq = freq;
				secondWord = word;

			}

		}
		System.out.println("second word and frequesncy are: " + secondWord + " - " + secondFreq);

	}
}
