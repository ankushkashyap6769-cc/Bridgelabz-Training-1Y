package Encapsulation.VehicleRentalSystem;
public abstract class Vehicle{
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    public Vehicle(String vehicleNumber,String type,double rentalRate){
        this.vehicleNumber=vehicleNumber;
        this.type=type;
        this.rentalRate=rentalRate;
    }
    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public String getType(){
        return type;
    }
    public double getRentalRate(){
        return rentalRate;
    }
    public void setRentalRate(double rentalRate){
        if(rentalRate>0){
            this.rentalRate=rentalRate;
        }
    }
    public abstract double calculateRentalCost(int days);
}