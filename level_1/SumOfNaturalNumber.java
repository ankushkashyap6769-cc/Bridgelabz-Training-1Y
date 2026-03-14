package com.gla.methods.level_1;
import java.util.Scanner;
public class SumOfNaturalNumber {
    public int sumnatural(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumOfNaturalNumber smm = new SumOfNaturalNumber();
        System.out.print("Enter Your Number: ");
        int n = sc.nextInt();
        if(n<=0){
            return;
        }
        System.out.println(smm.sumnatural(n));
    }
}
