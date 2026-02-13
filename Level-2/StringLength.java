import java.util.Scanner;
class StringLength{
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.next();
        int customLength = findLength(input);
        int actualLength = input.length();
        System.out.println("Length calculated without using length(): " + customLength);
        System.out.println("Length using built-in length() method: " + actualLength);
    }
}
