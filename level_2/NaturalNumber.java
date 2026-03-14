package com.gla.methods.level_2;
import java.util.Scanner;
public class NaturalNumber {
    public int natural(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NaturalNumber nn = new NaturalNumber();
        System.out.print("Enter Number: ");
        int n= sc.nextInt();
        if(nn.natural(n)==(n*(n+1)/2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
