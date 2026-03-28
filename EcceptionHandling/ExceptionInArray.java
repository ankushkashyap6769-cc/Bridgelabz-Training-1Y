package EcceptionHandling;
//import java.util.Arrays;
import java.util.*;
public class ExceptionInArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayay = {1, 2, 3, 4, 5};
        System.out.println("Your Array: " + Arrays.toString(arrayay));
        System.out.print("Enter Index: ");
        int index = sc.nextInt();
        try{
            int[] array = null;
            System.out.println(arrayay[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
