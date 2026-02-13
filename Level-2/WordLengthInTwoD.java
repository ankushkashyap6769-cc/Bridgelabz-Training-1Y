import java.util.Scanner;
class WordLengthInTwoD{
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();
        String[] words = customSplit(input);
        String[][] data = getWordAndLength(words);
        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (int i = 0; i < data.length; i++) {
            String word = data[i][0];
            int length = Integer.parseInt(data[i][1]);
            System.out.println(word + "\t" + length);
        }
    }
}
