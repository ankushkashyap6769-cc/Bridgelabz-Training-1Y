package Encapsulation.VehicleRentalSystem;
public class Bike extends Vehicle implements Insurable{
    private String policyNumber;
    public Bike(String number,double rate,String policyNumber){
        super(number,"Bike",rate);
        this.policyNumber=policyNumber;
    }
    public double calculateRentalCost(int days){
        return days*getRentalRate();
    }
    public double calculateInsurance(){
        return getRentalRate()*0.05;
    }
    public String getInsuranceDetails(){
        return "Bike Insurance Policy: "+policyNumber;
    }
}