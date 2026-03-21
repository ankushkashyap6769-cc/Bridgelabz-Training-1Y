package Inheritance.EmployeeSystem;
public class Developer extends Employee{
    private String programmingLanguage;
    public Developer(String name,int id,double salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Role: Developer");
        System.out.println("Programming Language: "+programmingLanguage);
    }
}