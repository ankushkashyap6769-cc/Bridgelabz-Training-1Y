package Encapsulation.VehicleRentalSystem;
import java.util.*;
public class Runner{
    public static void main(String[] args){
        ArrayList<Vehicle> vehicles=new ArrayList<>();
        vehicles.add(new Car("UP 80 AK 0001",2000,"CAR247"));
        vehicles.add(new Bike("UP 80 SX 6969",500,"BIKE143"));
        vehicles.add(new Truck("UP 80 AZ 6767",3000,"TRUCK777"));
        int days=3;
        for(Vehicle v:vehicles){
            double rentalCost=v.calculateRentalCost(days);
            Insurable i=(Insurable)v;
            double insurance=i.calculateInsurance();
            System.out.println("Vehicle: "+v.getType());
            System.out.println("Number: "+v.getVehicleNumber());
            System.out.println("Rental Cost: "+rentalCost);
            System.out.println("Insurance: "+insurance);
            System.out.println(i.getInsuranceDetails());
            System.out.println();
        }
    }
}
