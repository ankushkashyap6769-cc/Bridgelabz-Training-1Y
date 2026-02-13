import java.util.Scanner;
class NumberFormat{
    public static void generateException(String text) {
        System.out.println("Generating NumberFormatException...");
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }
    public static void handleException(String text) {
        System.out.println("Handling the exception using try-catch...");
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught.");
            System.out.println("Input string does not contain a valid integer.");
        } catch (RuntimeException e) {
            System.out.println("Some runtime exception occurred.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String inputText = scanner.next();
        try {
            generateException(inputText);
        } catch (Exception e) {
            System.out.println("Exception occurred while generating the error.");
        }
        System.out.println();
        handleException(inputText);
    }
}
