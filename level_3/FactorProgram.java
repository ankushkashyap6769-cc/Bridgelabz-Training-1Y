package com.gla.methods.level_3;
import java.util.Scanner;
public class FactorProgram{
    public static int[] getFactors(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        int[] factors=new int[count];
        int j=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                factors[j]=i;
                j++;
            }
        }
        return factors;
    }
    public static int greatestFactor(int[] factors){
        int max=factors[0];
        for(int i=1;i<factors.length;i++){
            if(factors[i]>max){
                max=factors[i];
            }
        }
        return max;
    }
    public static int sumFactors(int[] factors){
        int sum=0;
        for(int i=0;i<factors.length;i++){
            sum=sum+factors[i];
        }
        return sum;
    }
    public static int productFactors(int[] factors){
        int p=1;
        for(int i=0;i<factors.length;i++){
            p=p*factors[i];
        }
        return p;
    }
    public static double productCubeFactors(int[] factors){
        double p=1;
        for(int i=0;i<factors.length;i++){
            p=p*Math.pow(factors[i],3);
        }
        return p;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] factors=getFactors(num);
        System.out.println("Greatest Factor: "+greatestFactor(factors));
        System.out.println("Sum of Factors: "+sumFactors(factors));
        System.out.println("Product of Factors: "+productFactors(factors));
        System.out.println("Product of Cube of Factors: "+productCubeFactors(factors));
    }
}