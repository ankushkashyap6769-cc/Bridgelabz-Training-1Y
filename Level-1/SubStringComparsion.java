import java.util.Scanner;
class SubstringComparison {
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
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
        System.out.print("Enter a string: ");
        String text = scanner.next();
        System.out.print("Enter start index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter end index: ");
        int endIndex = scanner.nextInt();
        if (startIndex < 0 || endIndex > text.length() || startIndex >= endIndex) {
            System.out.println("Invalid index values.");
        } else {
            String manualSubstring = createSubstring(text, startIndex, endIndex);
            String builtInSubstring = text.substring(startIndex, endIndex);
            boolean comparisonResult = compareStrings(manualSubstring, builtInSubstring);
            System.out.println("\nSubstring using charAt(): " + manualSubstring);
            System.out.println("Substring using built-in method: " + builtInSubstring);
            System.out.println("Are both substrings equal? " + comparisonResult);
        }
    }
}
