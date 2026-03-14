package com.gla.methods.level_2;
import java.util.*;
public class QuadraticEquation {
    public double roots(double a, double b, double c){
        double delta = Math.pow(b,b) + 4*a*c;
        if(delta>0){
            double root = Math.sqrt(delta) / (2*a);
            return root;
        }
        else if(delta == 0){
            return (-b/(2*a));
        }
        return 0;
    }
    static void main(String[] args) {
        QuadraticEquation qc = new QuadraticEquation();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Three numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println(b- qc.roots(a,b,c));
        System.out.println(b + qc.roots(a,b,c));
    }
}
