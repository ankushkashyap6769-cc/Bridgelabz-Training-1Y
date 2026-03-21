package Inheritance.Transport;
public class Car extends Vehicle{
    private int seatCapacity;
    public Car(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity=seatCapacity;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity: "+seatCapacity);
    }
}