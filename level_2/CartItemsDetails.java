package com.gla.objectsANDclasses.level_2;
import java.util.Scanner;
class CartItem{
    String itemName;
    double price;
    int quantity;
    void add(String n,double p,int q){
        itemName=n;
        price=p;
        quantity=quantity+q;
    }
    void remove(int q){
        if(q<=quantity){
            quantity=quantity-q;
        }else{
            System.out.println("Not enough items");
        }
    }
    void total(){
        double t=price*quantity;
        System.out.println("Total Cost: "+t);
    }
}
public class CartItemsDetails{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        CartItem c=new CartItem();
        System.out.println("item name: ");
        String n=sc.nextLine();
        System.out.println("Prive: ");
        double p=sc.nextDouble();
        System.out.println("Qty: ");
        int q=sc.nextInt();
        c.add(n,p,q);
        System.out.println("remove>; ");
        int r=sc.nextInt();
        c.remove(r);
        c.total();
    }
}