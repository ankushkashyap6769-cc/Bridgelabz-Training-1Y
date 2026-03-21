package Inheritance.Transport;
public class Motorcycle extends Vehicle{
    private boolean hasGear;
    public Motorcycle(int maxSpeed,String fuelType,boolean hasGear){
        super(maxSpeed,fuelType);
        this.hasGear=hasGear;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Has Gear: "+hasGear);
    }
}