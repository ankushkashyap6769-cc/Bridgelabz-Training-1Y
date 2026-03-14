package com.gla.methods.level_3;
import java.util.Scanner;
public class ColinearPoints{
    public static boolean slopeMethod(int x1,int y1,int x2,int y2,int x3,int y3){
        double ab=(double)(y2-y1)/(x2-x1);
        double bc=(double)(y3-y2)/(x3-x2);
        double ac=(double)(y3-y1)/(x3-x1);
        if(ab==bc&&bc==ac){
            return true;
        }
        return false;
    }
    public static boolean areaMethod(int x1,int y1,int x2,int y2,int x3,int y3){
        double area=0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
        if(area==0){
            return true;
        }
        return false;
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
        System.out.println("X3: ");
        int x3=sc.nextInt();
        System.out.println("Y3: ");
        int y3=sc.nextInt();
        if(slopeMethod(x1,y1,x2,y2,x3,y3)){
            System.out.println("Collinear using slope method");
        }else{
            System.out.println("Not collinear using slope method");
        }
        if(areaMethod(x1,y1,x2,y2,x3,y3)){
            System.out.println("Collinear using area method");
        }else{
            System.out.println("Not collinear using area method");
        }
    }
}