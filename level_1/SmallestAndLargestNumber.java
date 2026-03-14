package com.gla.methods.level_1;
import java.util.Scanner;
public class SmallestAndLargestNumber {
    public int num_largest(int n1, int n2, int n3){
        if(n1>n2 && n1>n3){
            return n1;
        }
        else if(n2>n1 && n2>n3){
            return n2;
        }
        return n3;
    }
    public int num_smallest(int n1, int n2, int n3){
        if(n1<n2 && n1<n3){
            return n1;
        }
        else if(n2<n1 && n2<n3){
            return n2;
        }
        return n3;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmallestAndLargestNumber find = new SmallestAndLargestNumber();
        System.out.print("Enter Your Numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println("The Largest Number Is: " + find.num_largest(n1,n2,n3)+ " And The Smallest Number Is: " + find.num_smallest(n1,n2,n3));
    }
}
