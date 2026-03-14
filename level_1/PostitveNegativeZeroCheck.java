package com.gla.methods.level_1;
import java.util.Scanner;
public class PostitveNegativeZeroCheck {
    public int check(int num){
        if(num<0){
            return -1;
        }
        else if(num==0){
            return 0;
        }
        return 1;
    }

    static void main(String[] args) {
        PostitveNegativeZeroCheck chk = new PostitveNegativeZeroCheck();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = sc.nextInt();
        System.out.println("Your Number is: " + chk.check(number) );
    }
}
