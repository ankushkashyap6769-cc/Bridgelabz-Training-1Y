package com.gla.methods.level_3;
import java.util.Scanner;
public class NumberChecker{
    public static int countDigits(int n){
        int c=0;
        while(n!=0){
            c++;
            n=n/10;
        }
        return c;
    }
    public static int[] getDigits(int n){
        int count=countDigits(n);
        int[] digits=new int[count];
        for(int i=count-1;i>=0;i--){
            digits[i]=n%10;
            n=n/10;
        }
        return digits;
    }
    public static boolean isDuck(int[] digits){
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0){
                return true;
            }
        }
        return false;
    }
    public static boolean isArmstrong(int[] digits){
        int power=digits.length;
        int sum=0;
        for(int i=0;i<digits.length;i++){
            sum=sum+(int)Math.pow(digits[i],power);
        }
        int num=0;
        for(int i=0;i<digits.length;i++){
            num=num*10+digits[i];
        }
        if(sum==num){
            return true;
        }else{
            return false;
        }
    }
    public static void largestTwo(int[] digits){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<digits.length;i++){
            if(digits[i]>largest){
                secondLargest=largest;
                largest=digits[i];
            }else if(digits[i]>secondLargest&&digits[i]!=largest){
                secondLargest=digits[i];
            }
        }
        System.out.println("Largest: "+largest);
        System.out.println("Second Largest: "+secondLargest);
    }
    public static void smallestTwo(int[] digits){
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int i=0;i<digits.length;i++){
            if(digits[i]<smallest){
                secondSmallest=smallest;
                smallest=digits[i];
            }else if(digits[i]<secondSmallest&&digits[i]!=smallest){
                secondSmallest=digits[i];
            }
        }
        System.out.println("Smallest: "+smallest);
        System.out.println("Second Smallest: "+secondSmallest);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=countDigits(num);
        System.out.println("Digits Count: "+count);
        int[] digits=getDigits(num);
        if(isDuck(digits)){
            System.out.println("Duck Number");
        }else{
            System.out.println("Not Duck Number");
        }
        if(isArmstrong(digits)){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
        largestTwo(digits);
        smallestTwo(digits);
    }
}