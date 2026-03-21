package Inheritance.SchoolSystemWithDiffrentRoles;
public class Staff extends Person{
    private String department;
    public Staff(String name,int age,String department){
        super(name,age);
        this.department=department;
    }
    public void displayRole(){
        System.out.println("Role: Staff");
        System.out.println("Department: "+department);
    }
}