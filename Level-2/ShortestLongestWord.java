import java.util.Scanner;
class ShortestLongestWord {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        int[] spaces = new int[wordCount - 1];
        int k = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaces[k++] = i;
            }
        }
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount - 1; i++) {
            int end = spaces[i];
            words[i] = text.substring(start, end);
            start = end + 1;
        }
        words[wordCount - 1] = text.substring(start, length);
        return words;
    }
    public static String[][] getWordAndLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            int len = findLength(words[i]);
            result[i][1] = String.valueOf(len);
        }
        return result;
    }
    public static int[] findShortestAndLongest(String[][] data) {
        int minIndex = 0;
        int maxIndex = 0;
        int minLength = Integer.parseInt(data[0][1]);
        int maxLength = Integer.parseInt(data[0][1]);
        for (int i = 1; i < data.length; i++) {
            int currentLength = Integer.parseInt(data[i][1]);
            if (currentLength < minLength) {
                minLength = currentLength;
                minIndex = i;
            }
            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();
        String[] words = customSplit(input);
        String[][] data = getWordAndLength(words);
        int[] result = findShortestAndLongest(data);
        int shortestIndex = result[0];
        int longestIndex = result[1];
        System.out.println("\nShortest Word: " + data[shortestIndex][0] +
                " (Length: " + Integer.parseInt(data[shortestIndex][1]) + ")");
        System.out.println("Longest Word: " + data[longestIndex][0] +
                " (Length: " + Integer.parseInt(data[longestIndex][1]) + ")");
    }
}
