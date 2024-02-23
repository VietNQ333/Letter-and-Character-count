package Model;

public class CountChar {
    public static void countAllCharacters(String inputString) {
        int[] charCount = new int[26];

        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = Character.toLowerCase(c) - 'a';
                charCount[index]++;
            }
        }

        System.out.println("Characters and their occurrences:");

        for (int i = 0; i < charCount.length; i++) {
            char currentChar = (char) ('a' + i);
            if (charCount[i] > 0) {
                System.out.println(currentChar + "= " + charCount[i]);
            }
        }
    }

    public static int count(String inputString, char charToCount) {
        int count = 0;
        for (char c : inputString.toCharArray()) {
            if (c == charToCount) {
                count++;
            }
        }
        return count;
    }
}