public class NulPointerException{

    public static void generateException() {

        String text = null;
        System.out.println(text.length());
    }

    public static void handleException() {

        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException) {
            System.out.println("NullPointerException caught. Cannot call methods on a null reference.");
        }
    }

    public static void main(String[] args) {

        System.out.println("Generating NullPointerException:");

        try {
            generateException();
        } catch (NullPointerException) {
            System.out.println("Exception occurred while calling generateException().");
        }

        System.out.println("\nHandling NullPointerException using try-catch:");
        handleException();
    }
}
