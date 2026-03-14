package com.gla.methods.level_1;
import java.util.Scanner;
public class QuotientAndRemainder {
    public int quotient(int num, int div){
        return num/div;
    }
    public int remainder(int num, int div){
        return num%div;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuotientAndRemainder find = new QuotientAndRemainder();
        System.out.print("Enter Number: ");
        int number = sc.nextInt();
        System.out.print("Enter Divisior: ");
        int divisor = sc.nextInt();
        System.out.println("Quotient is: " + find.quotient(number,divisor) + " And Remainder Is: " + find.remainder(number,divisor));
    }
}