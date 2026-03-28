package EcceptionHandling;
import java.util.Scanner;
public class DivideByZero {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  divison = 0;
        try{
            System.out.print("Enter First Number: ");
            int firstNumber = in.nextInt();
            System.out.print("Enter Second Number: ");
            int secondNumber = in.nextInt();
            divison = firstNumber / secondNumber;
        } catch (Exception e) {
            System.out.println("Exception Caught " + e.getMessage());
        }
        System.out.println(divison);
    }
}
