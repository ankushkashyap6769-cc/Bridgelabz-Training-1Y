package EcceptionHandling;
import java.util.Arrays;
import java.util.Scanner;
public class NestedTryCatch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {6, 7, 6, 9};
        System.out.println("Your Array: " + Arrays.toString(array));
        System.out.print("Enter Index: ");
        int index = sc.nextInt();
        System.out.print("Enter Divisor: ");
        int divisor = sc.nextInt();
        try{
            System.out.println("Array at Index: " + array[index]);
            try{
                System.out.println("Divison: " + array[index]/divisor);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
