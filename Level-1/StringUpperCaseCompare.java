import java.util.Scanner;
public class StringUpperCaseCompare {
    public static String convertToUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result = result + ch;
        }
        return result;
    }
    public static boolean compareStrings(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a complete text: ");
        String inputText = scanner.nextLine();
        String manualUpper = convertToUpper(inputText);
        String builtInUpper = inputText.toUpperCase();
        boolean result = compareStrings(manualUpper, builtInUpper);
        System.out.println("\nUppercase using user-defined method: " + manualUpper);
        System.out.println("Uppercase using built-in method: " + builtInUpper);
        System.out.println("Are both results equal? " + result);
    }
}
