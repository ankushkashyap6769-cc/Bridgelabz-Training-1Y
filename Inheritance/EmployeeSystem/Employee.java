package Inheritance.EmployeeSystem;
public class Employee{
    protected String name;
    protected int id;
    protected double salary;
    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
    }
}