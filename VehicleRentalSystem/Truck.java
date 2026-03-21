package Encapsulation.VehicleRentalSystem;
public class Truck extends Vehicle implements Insurable{
    private String policyNumber;
    public Truck(String number,double rate,String policyNumber){
        super(number,"Truck",rate);
        this.policyNumber=policyNumber;
    }
    public double calculateRentalCost(int days){
        return days*getRentalRate()*1.5;
    }
    public double calculateInsurance(){
        return getRentalRate()*0.15;
    }
    public String getInsuranceDetails(){
        return "Truck Insurance Policy: "+policyNumber;
    }
}