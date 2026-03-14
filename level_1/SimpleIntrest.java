package com.gla.methods.level_1;
import java.util.Scanner;
public class SimpleIntrest {
    public int simpleintrest(int p, int r, int t) {
        return (p * r * t);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleIntrest si = new SimpleIntrest();
        System.out.print("Enter Principal: ");
        int principal = sc.nextInt();
        System.out.print("Enter Rate: ");
        int rate = sc.nextInt();
        System.out.print("Enter Time: ");
        int time = sc.nextInt();
        System.out.print("The Simple Intrest is " + si.simpleintrest(principal,time,rate));
        System.out.print(" for principal " + principal);
        System.out.print(" Rate of intrest " + rate);
        System.out.print(" and time " + time);
    }
}
