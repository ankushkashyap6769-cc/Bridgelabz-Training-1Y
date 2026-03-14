package com.gla.objectsANDclasses.level_1;
import java.util.Scanner;
class ItemDetails {
    int itemCode;
    String itemName;
    double price;
    void display(){
        System.out.println("Code: "+itemCode);
        System.out.println("Name: "+itemName);
        System.out.println("Price: "+price);
    }
    void totalCost(int qty){
        double total=price*qty;
        System.out.println("Total Cost: "+total);
    }
}
public class Item{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ItemDetails i=new ItemDetails();
        System.out.println("Enter Item Code: ");
        i.itemCode=sc.nextInt();
        sc.nextLine();
        System.out.println("NAme: ");
        i.itemName=sc.nextLine();
        System.out.println("Enter Price: ");
        i.price=sc.nextDouble();
        System.out.println("Enter Qty: ");
        int qty=sc.nextInt();
        i.display();
        i.totalCost(qty);
    }
}