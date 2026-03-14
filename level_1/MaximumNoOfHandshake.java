package com.gla.methods.level_1;
import java.util.Scanner;
public class MaximumNoOfHandshake {
    public int handshakecalculate(int n){
        return (n*(n-1))/2;
    }

    static void main(String[] args) {
        MaximumNoOfHandshake hs = new MaximumNoOfHandshake();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Students: ");
        int no_of_students = sc.nextInt();
        System.out.println("No of possible handshakes: " + hs.handshakecalculate(no_of_students));
    }
}