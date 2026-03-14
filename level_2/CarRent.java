package com.gla.objectsANDclasses.level_2;
import java.util.Scanner;
class CarRental{
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay=1000;
    CarRental(){
        customerName="Customer";
        carModel="Car";
        rentalDays=1;
    }
    CarRental(String c,String m,int d){
        customerName=c;
        carModel=m;
        rentalDays=d;
    }
    double totalCost(){
        return rentalDays*costPerDay;
    }
    void display(){
        System.out.println("Customer: "+customerName);
        System.out.println("Car Model: "+carModel);
        System.out.println("Rental Days: "+rentalDays);
        System.out.println("Total Cost: "+totalCost());
    }
}
public class CarRent{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Name: ");
        String c=sc.nextLine();
        System.out.println("Model: ");
        String m=sc.nextLine();
        System.out.println("Days: ");
        int d=sc.nextInt();
        CarRental r=new CarRental(c,m,d);
        r.display();
    }
}