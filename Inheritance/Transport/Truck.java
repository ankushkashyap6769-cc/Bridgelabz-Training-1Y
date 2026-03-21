package Inheritance.Transport;
public class Truck extends Vehicle{
    private double loadCapacity;
    public Truck(int maxSpeed,String fuelType,double loadCapacity){
        super(maxSpeed,fuelType);
        this.loadCapacity=loadCapacity;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Load Capacity: "+loadCapacity+" tons");
    }
}