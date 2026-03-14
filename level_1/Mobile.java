package com.gla.objectsANDclasses.level_1;
import java.util.Scanner;
class MobilePhone{
    String brand;
    String model;
    double price;
    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }
}
public class Mobile{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MobilePhone m=new MobilePhone();
        System.out.println("Brand name: ");
        m.brand=sc.nextLine();
        System.out.println("Model name: ");
        m.model=sc.nextLine();
        System.out.println("Price: ");
        m.price=sc.nextDouble();
        m.display();
    }
}