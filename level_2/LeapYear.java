package com.gla.methods.level_2;
import java.util.Scanner;
public class LeapYear {
    public boolean leap(int y){
        if(y%4==0 && (y%100!=0 || y%400==0)){
            return true;
        }
        return false;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LeapYear ly = new LeapYear();
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        System.out.println(ly.leap(year));
    }
}
