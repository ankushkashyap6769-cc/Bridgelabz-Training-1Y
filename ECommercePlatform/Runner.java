package Encapsulation.ECommercePlatform;
import java.util.*;
public class Runner{
    public static void main(String[] args){
        ArrayList<Product> products=new ArrayList<>();
        products.add(new Electronics(1,"Laptop",50000));
        products.add(new Clothing(2,"Shirt",2000));
        products.add(new Groceries(3,"Rice",1000));
        for(Product p:products){
            double price=p.getPrice();
            double discount=p.calculateDiscount();
            double tax=0;
            if(p instanceof Taxable){
                Taxable t=(Taxable)p;
                tax=t.calculateTax();
                System.out.println(t.getTaxDetails());
            }
            double finalPrice=price+tax-discount;
            System.out.println("Product: "+p.getName());
            System.out.println("Final Price: "+finalPrice);
            System.out.println();
        }
    }
}