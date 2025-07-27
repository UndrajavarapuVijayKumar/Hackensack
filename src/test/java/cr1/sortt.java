package cr1;

import java.util.*;

public class sortt {
    public static void main(String[] args) {
        String s = "is2 this1 word4 a3";
        String[] words = s.split(" ");
        
        // Temporary array to hold words in correct order
        String[] sorted = new String[words.length];

        for (String word : words) {
            // Extract digit from word using regex or Character.isDigit()
            for (char ch : word.toCharArray()) {
                if (Character.isDigit(ch)) {
                    int position = ch - '1'; // Convert char to index (0-based)
                    sorted[position] = word.replaceAll("[0-9]", ""); // remove the number
                    break;
                }
            }
        }

        // Join the sorted words into a sentence
        String result = String.join(" ", sorted);
        System.out.println(result);
    }
}
