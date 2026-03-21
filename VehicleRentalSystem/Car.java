package Encapsulation.VehicleRentalSystem;
public class Car extends Vehicle implements Insurable{
    private String policyNumber;
    public Car(String number,double rate,String policyNumber){
        super(number,"Car",rate);
        this.policyNumber=policyNumber;
    }
    public double calculateRentalCost(int days){
        return days*getRentalRate();
    }
    public double calculateInsurance(){
        return getRentalRate()*0.10;
    }
    public String getInsuranceDetails(){
        return "Car Insurance Policy: "+policyNumber;
    }
}