package Encapsulation.ECommercePlatform;
public class Groceries extends Product{
    public Groceries(int id,String name,double price){
        super(id,name,price);
    }
    public double calculateDiscount(){
        return getPrice()*0.05;
    }
}