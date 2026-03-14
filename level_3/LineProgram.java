package com.gla.methods.level_3;
import java.util.Scanner;
public class LineProgram{
    public static double distance(int x1,int y1,int x2,int y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    public static double[] equation(int x1,int y1,int x2,int y2){
        double m=(double)(y2-y1)/(x2-x1);
        double b=y1-m*x1;
        double[] result=new double[2];
        result[0]=m;
        result[1]=b;
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("X1: ");
        int x1=sc.nextInt();
        System.out.println("Y1: ");
        int y1=sc.nextInt();
        System.out.println("X2: ");
        int x2=sc.nextInt();
        System.out.println("Y2: ");
        int y2=sc.nextInt();
        double d=distance(x1,y1,x2,y2);
        System.out.println("Distance: "+d);
        double[] eq=equation(x1,y1,x2,y2);
        System.out.println("Slope: "+eq[0]);
        System.out.println("Intercept: "+eq[1]);
    }
}