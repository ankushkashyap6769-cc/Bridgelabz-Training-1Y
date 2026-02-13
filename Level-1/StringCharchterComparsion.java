import java.util.Scanner;
class StringCharchterComparsion{
    public static char[] getCharacters(String text) {
        char[] characters = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }
        return characters;
    }
    public static boolean compareCharArrays(char[] first, char[] second) {
        if (first.length != second.length) {
            return false;
        }
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.next();
        char[] manualArray = getCharacters(inputText);
        char[] builtInArray = inputText.toCharArray();
        boolean result = compareCharArrays(manualArray, builtInArray);
        System.out.print("\nCharacters using user-defined method: ");
        for (int i = 0; i < manualArray.length; i++) {
            System.out.print(manualArray[i] + " ");
        }
        System.out.print("\nCharacters using built-in toCharArray(): ");
        for (int i = 0; i < builtInArray.length; i++) {
            System.out.print(builtInArray[i] + " ");
        }
        System.out.println("\n\nAre both character arrays equal? " + result);
    }
}
