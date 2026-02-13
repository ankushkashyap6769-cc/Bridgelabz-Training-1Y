import java.util.Scanner;
class IllegalArgument{
    public static void generateException(String text) {
        System.out.println("Generating IllegalArgumentException...");
        System.out.println(text.substring(5, 2));
    }
    public static void handleException(String text) {
        System.out.println("Handling the exception using try-catch...");
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught.");
            System.out.println("Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("Some runtime exception occurred.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
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
