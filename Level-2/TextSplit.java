import java.util.Scanner;
class TextSplit{
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
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();
        String[] custom = customSplit(input);
        String[] builtin = input.split(" ");
        System.out.println("\nCustom Split:");
        for (String word : custom) {
            System.out.println(word);
        }
        System.out.println("\nBuilt-in Split:");
        for (String word : builtin) {
            System.out.println(word);
        }
        boolean same = compareArrays(custom, builtin);
        System.out.println("\nAre both results same? " + same);
    }
}
