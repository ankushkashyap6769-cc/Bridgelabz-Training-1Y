package Inheritance.SchoolSystemWithDiffrentRoles;
public class Teacher extends Person{
    private String subject;
    public Teacher(String name,int age,String subject){
        super(name,age);
        this.subject=subject;
    }
    public void displayRole(){
        System.out.println("Role: Teacher");
        System.out.println("Subject: "+subject);
    }
}