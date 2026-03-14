package com.gla.methods.level_3;
import java.util.Scanner;
public class CalendarProgram{
    public static String getMonthName(int m){
        String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months[m-1];
    }
    public static boolean isLeap(int y){
        if((y%4==0&&y%100!=0)||y%400==0){
            return true;
        }
        return false;
    }
    public static int getDays(int m,int y){
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        if(m==2&&isLeap(y)){
            return 29;
        }
        return days[m-1];
    }
    public static int firstDay(int m,int y){
        int d=1;
        int y0=y-(14-m)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=m+12*((14-m)/12)-2;
        int d0=(d+x+31*m0/12)%7;
        return d0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month: ");
        int m=sc.nextInt();
        System.out.print("Enter year: ");
        int y=sc.nextInt();
        System.out.println(getMonthName(m)+" "+y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int start=firstDay(m,y);
        int days=getDays(m,y);
        for(int i=0;i<start;i++){
            System.out.print("   ");
        }
        for(int d=1;d<=days;d++){
            System.out.printf("%3d",d);
            if((d+start)%7==0){
                System.out.println();
            }
        }
    }
}