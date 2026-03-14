package com.gla.methods.level_1;
import java.util.*;
public class TrignometricFunctions {
    public double calculateTrignometricFunctions(double angle){
        double radian = angle*(Math.PI/180);
        System.out.println("Sine: " + Math.sin(radian));
        System.out.println("Cosine: " + Math.cos(radian));
        System.out.println("Tangent: " + Math.tan(radian));
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrignometricFunctions find = new TrignometricFunctions();
        System.out.print("Enter Angle: ");
        double angle = sc.nextDouble();
        find.calculateTrignometricFunctions(angle);
    }
}
