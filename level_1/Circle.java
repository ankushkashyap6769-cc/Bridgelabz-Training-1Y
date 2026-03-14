package com.gla.objectsANDclasses.level_1;
import java.util.Scanner;
class CircleRadius {
    double radius;
    void area(){
        double a=Math.PI*radius*radius;
        System.out.println("Area: "+a);
    }
    void circumference(){
        double c=2*Math.PI*radius;
        System.out.println("Circumference: "+c);
    }
}
public class Circle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        CircleRadius c=new CircleRadius();
        System.out.print("Enter Circle Radis: ");
        c.radius=sc.nextDouble();
        c.area();
        c.circumference();
    }
}