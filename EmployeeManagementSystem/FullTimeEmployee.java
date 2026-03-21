package Encapsulation.EmployeeManagementSystem;
public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(int id,String name,double salary){
        super(id,name,salary);
    }
    public double calculateSalary(){
        return getBaseSalary();
    }
}