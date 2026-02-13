import java.util.Scanner;

class Anagram{

    public static boolean areAnagrams(String text1, String text2) {
        int len1 = 0, len2 = 0;
        try {
            while (true) { text1.charAt(len1); len1++; }
        } catch (Exception e) {}
        try {
            while (true) { text2.charAt(len2); len2++; }
        } catch (Exception e) {}
        if (len1 != len2) return false;

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (int i = 0; i < len1; i++) freq1[text1.charAt(i)]++;
        for (int i = 0; i < len2; i++) freq2[text2.charAt(i)]++;

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first text:");
        String t1 = sc.nextLine();
        System.out.println("Enter second text:");
        String t2 = sc.nextLine();

        boolean result = areAnagrams(t1, t2);
        System.out.println(result ? "The texts are anagrams" : "The texts are not anagrams");
        sc.close();
    }
}
