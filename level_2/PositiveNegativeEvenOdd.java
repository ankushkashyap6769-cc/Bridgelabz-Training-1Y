package com.gla.methods.level_2;
import java.util.Scanner;
public class PositiveNegativeEvenOdd{
    public static boolean isPositive(int num){
        if(num>=0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static int compare(int num1,int num2){
        if(num1>num2){
            return 1;
        }else if(num1==num2){
            return 0;
        }else{
            return -1;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] numbers=new int[5];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        for(int i=0;i<numbers.length;i++){
            if(isPositive(numbers[i])){
                System.out.print(numbers[i]+" is Positive and ");
                if(isEven(numbers[i])){
                    System.out.println("Even");
                }else{
                    System.out.println("Odd");
                }
            }else{
                System.out.println(numbers[i]+" is Negative");
            }
        }
        int result=compare(numbers[0],numbers[numbers.length-1]);
        if(result==1){
            System.out.println("First element is greater than last element");
        }else if(result==0){
            System.out.println("First element is equal to last element");
        }else{
            System.out.println("First element is less than last element");
        }
    }
}


