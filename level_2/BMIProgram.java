package com.gla.methods.level_2;
import java.util.Scanner;
public class BMIProgram{
    public static void calculateBMI(double[][] data){
        for(int i=0;i<data.length;i++){
            double weight=data[i][0];
            double height=data[i][1]/100.0;
            double bmi=weight/(height*height);
            data[i][2]=bmi;
        }
    }
    public static String[] getStatus(double[][] data){
        String[] status=new String[data.length];
        for(int i=0;i<data.length;i++){
            double bmi=data[i][2];
            if(bmi<18.5){
                status[i]="Underweight";
            }else if(bmi<25){
                status[i]="Normal";
            }else if(bmi<30){
                status[i]="Overweight";
            }else{
                status[i]="Obese";
            }
        }
        return status;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[][] data=new double[10][3];
        for(int i=0;i<10;i++){
            data[i][0]=sc.nextDouble();
            data[i][1]=sc.nextDouble();
        }
        calculateBMI(data);
        String[] status=getStatus(data);
        for(int i=0;i<10;i++){
            System.out.println(data[i][0]+" "+data[i][1]+" "+data[i][2]+" "+status[i]);
        }
    }
}
