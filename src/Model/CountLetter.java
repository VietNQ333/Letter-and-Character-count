package Model;

import java.util.StringTokenizer;

public class CountLetter {
 
    public static int count(String inputString, String wordToCount) {
        StringTokenizer tokenizer = new StringTokenizer(inputString, " \t\n\r\f,.:;?![]");

        int count = 0;
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (token.equalsIgnoreCase(wordToCount)) {
                count++;
            }
        }
        return count;
    }
}

