package Encapsulation.EmployeeManagementSystem;
public class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double ratePerHour;
    public PartTimeEmployee(int id,String name,double ratePerHour,int hoursWorked){
        super(id,name,0);
        this.ratePerHour=ratePerHour;
        this.hoursWorked=hoursWorked;
    }
    public double calculateSalary(){
        return hoursWorked*ratePerHour;
    }
}