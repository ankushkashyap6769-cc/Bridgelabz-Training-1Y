import java.util.Scanner;

class Palindrome{

    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = 0;
        try {
            while (true) {
                text.charAt(end);
                end++;
            }
        } catch (Exception e) {}
        end--; 
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String input = sc.nextLine();

        boolean iterativeResult = isPalindromeIterative(input);
        int length = 0;
        try {
            while (true) {
                input.charAt(length);
                length++;
            }
        } catch (Exception e) {}
        boolean recursiveResult = isPalindromeRecursive(input, 0, length - 1);

        System.out.println("Iterative check: " + (iterativeResult ? "Palindrome" : "Not Palindrome"));
        System.out.println("Recursive check: " + (recursiveResult ? "Palindrome" : "Not Palindrome"));
        sc.close();
    }
}
