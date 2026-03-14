package com.gla.methods.level_2;
import java.util.Scanner;
public class UnitConverter {
    public static double kilometerToMile(double number){
        return number*0.621371;
    }
    public static double mileToKilometer(double number){
        return number*1.60934;
    }
    public static double meterToFeet(double number){
        return number*3.28084;
    }
    public static double feetToMeter(double number) {
        return number * 0.3048;
    }
    public static double yardToFeet(double number){
        return  number * 3;
    }
    public  static double feetToYard(double number){
        return  number * 0.333333;
    }
    public static double meterToInches(double number){
        return number * 39.3701;
    }
    public static double inchesToMeter(double number){
        return number * 0.0254;
    }
    public static double inchesToCentimeter(double number){
        return number * 2.54;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        double number = sc.nextDouble();
        System.out.println("Kilometer to mile: " + kilometerToMile(number));
        System.out.println("Mile to kilometer: " + mileToKilometer(number));
        System.out.println("Meter to feets: " + meterToFeet(number));
        System.out.println("Feets to meter: " + feetToMeter(number));
        System.out.println("Yard to feet: " + yardToFeet(number));
        System.out.println("Feet to yard: " + feetToYard(number));
        System.out.println("Meter to inches: " + meterToInches(number));
        System.out.println("Inches to meter: " + inchesToMeter(number));
        System.out.println("Inches to centimeter: " + inchesToCentimeter(number));
    }
}
