import java.util.Scanner;

class ArrayIndexOutOfBoundException{
    public static void generateException(String[] names) {
        System.out.println("Generating ArrayIndexOutOfBoundsException...");
        System.out.println(names[names.length + 1]);
    }
    public static void handleException(String[] names) {
        System.out.println("Handling the exception using try-catch...");
        try {
            System.out.println(names[names.length + 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught.");
            System.out.println("Index is greater than the array length.");
        } catch (RuntimeException e) {
            System.out.println("Some runtime exception occurred.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int size = scanner.nextInt();
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.next();
        }
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception occurred while generating the error.");
        }
        System.out.println();
        handleException(names);
    }
}
