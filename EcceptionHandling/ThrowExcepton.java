package EcceptionHandling;
import java.util.*;
public class ThrowExcepton {
    public static void Intrest(double p, double r, double t){
        if(r<=0 || t<=0){
            System.out.println("Invalid Input: Amount And Rate Must Be Zero");
            throw new IllegalArgumentException();
        }
        else{
            System.out.println("Intrest: " + (p*r*t)/100);
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time: ");
        double time = sc.nextDouble();
        Intrest(principal,rate,time);
//        6. throw vs. throws (Exception Propagation)
//💡 Problem Statement:
//        Create a method calculateInterest(double amount, double rate, int
//        years) that:
//● Throws IllegalArgumentException if amount or rate is negative.
//● Propagates the exception using throws and handles it in main().
//                Expected Behavior:
//● If valid, return and print the calculated interest.
//● If invalid, catch and display "Invalid input: Amount and rate must be
//        positive".
    }
}
