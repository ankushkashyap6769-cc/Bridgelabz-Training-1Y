package com.gla.methods.level_2;
import java.util.*;
public class FactorProgram {
    public static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int findProduct(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }
    public static double sumOfSquares(int[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += Math.pow(arr[i], 2);
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] factors = getFactors(num);
        System.out.println("Factors are:");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
        int sum = findSum(factors);
        int product = findProduct(factors);
        double squareSum = sumOfSquares(factors);
        System.out.println("Sum of fctors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + squareSum);
    }
}
