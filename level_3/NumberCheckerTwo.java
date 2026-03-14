package com.gla.methods.level_3;
import java.util.Scanner;
public class NumberCheckerTwo{
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
    public static int sumDigits(int[] digits){
        int sum=0;
        for(int i=0;i<digits.length;i++){
            sum=sum+digits[i];
        }
        return sum;
    }
    public static int sumSquares(int[] digits){
        int sum=0;
        for(int i=0;i<digits.length;i++){
            sum=sum+(int)Math.pow(digits[i],2);
        }
        return sum;
    }
    public static boolean isHarshad(int num,int[] digits){
        int s=sumDigits(digits);
        if(num%s==0){
            return true;
        }else{
            return false;
        }
    }
    public static int[][] frequency(int[] digits){
        int[][] freq=new int[10][2];
        for(int i=0;i<10;i++){
            freq[i][0]=i;
            freq[i][1]=0;
        }
        for(int i=0;i<digits.length;i++){
            freq[digits[i]][1]++;
        }
        return freq;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=countDigits(num);
        System.out.println("Count: "+count);
        int[] digits=getDigits(num);
        System.out.println("Sum of digits: "+sumDigits(digits));
        System.out.println("Sum of squares: "+sumSquares(digits));
        if(isHarshad(num,digits)){
            System.out.println("Harshad Number");
        }else{
            System.out.println("Not Harshad Number");
        }
        int[][] freq=frequency(digits);
        for(int i=0;i<10;i++){
            if(freq[i][1]>0){
                System.out.println(freq[i][0]+" "+freq[i][1]);
            }
        }
    }
}