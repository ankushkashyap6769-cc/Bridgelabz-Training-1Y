package Encapsulation.EmployeeManagementSystem;
public abstract class Employee implements Department{
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;
    public Employee(int employeeId,String name,double baseSalary){
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public String getName(){
        return name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary){
        if(baseSalary>0){
            this.baseSalary=baseSalary;
        }
    }
    public void assignDepartment(String dept){
        this.department=dept;
    }
    public String getDepartmentDetails(){
        return department;
    }
    public abstract double calculateSalary();
    public void displayDetails(){
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);
        System.out.println("Salary: "+calculateSalary());
        System.out.println();
    }
}