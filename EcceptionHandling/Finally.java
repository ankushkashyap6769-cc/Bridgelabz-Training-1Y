package EcceptionHandling;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Finally {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNumber = sc.nextInt();
        try{
            int divide = firstNumber / secondNumber;
            System.out.println("Answer: " + divide);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally {
            System.out.println("Code Exceuted...");
        }
    }
}
