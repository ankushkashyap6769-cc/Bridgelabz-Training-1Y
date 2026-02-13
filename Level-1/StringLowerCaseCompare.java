import java.util.Scanner;
class StringLowerCaseCompare{
    public static String convertToLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
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
        String manualLower = convertToLower(inputText);
        String builtInLower = inputText.toLowerCase();
        boolean result = compareStrings(manualLower, builtInLower);
        System.out.println("\nLowercase using user-defined method: " + manualLower);
        System.out.println("Lowercase using built-in method: " + builtInLower);
        System.out.println("Are both results equal? " + result);
        scanner.close();
    }
}
