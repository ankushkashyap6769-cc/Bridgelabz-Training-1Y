package PackageAssignment.college2.student;
public class Student{
    String name;
    int rollNo;
    public Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    public void displayStudent(){
        System.out.println("Student Name: "+name);
        System.out.println("Roll Number: "+rollNo);
    }
}