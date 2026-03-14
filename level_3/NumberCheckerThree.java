package com.gla.methods.level_3;
import java.util.Scanner;
public class NumberCheckerThree{
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
    public static int[] reverse(int[] digits){
        int[] rev=new int[digits.length];
        int j=0;
        for(int i=digits.length-1;i>=0;i--){
            rev[j]=digits[i];
            j++;
        }
        return rev;
    }
    public static boolean compare(int[] a,int[] b){
        if(a.length!=b.length){
            return false;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int[] digits){
        int[] rev=reverse(digits);
        return compare(digits,rev);
    }
    public static boolean isDuck(int[] digits){
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=countDigits(num);
        System.out.println("Count: "+count);
        int[] digits=getDigits(num);
        int[] rev=reverse(digits);
        if(isPalindrome(digits)){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not Palindrome Number");
        }
        if(isDuck(digits)){
            System.out.println("Duck Number");
        }else{
            System.out.println("Not Duck Number");
        }
    }
}