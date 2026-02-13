import java.util.Scanner;
class StringComparison {
    public static boolean compareUsingCharAt(String first, String second) {
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
        System.out.print("Enter the first string: ");
        String firstString = scanner.next();
        System.out.print("Enter the second string: ");
		//if(boolean vale){}
        String secondString = scanner.next();
        boolean charAtResult = compareUsingCharAt(firstString, secondString);
        boolean equalsResult = firstString.equals(secondString);
        System.out.println("\nResult using charAt metod comparison: " + charAtResult);
        System.out.println("Result using built-in equal method: " + equalsResult);
        if (charAtResult == equalsResult) {
            System.out.println("Both methods produced the same result.");
        } else {
            System.out.println("The results from both methods are different.");
        }
    }
}
