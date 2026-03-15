package PackageAssignment.college2;
import PackageAssignment.college2.student.Student;
import PackageAssignment.college2.faculty.Faculty;
import PackageAssignment.college2.department.Department;
import static java.lang.Math.*;
public class Runner{
    public static void main(String[] args){
        Student s=new Student("Ankush Kashyap",17);
        Faculty f=new Faculty("Tanmay Sir","Java-OOPs");
        Department d=new Department("Computer Science Engineering","Block VIII");
        System.out.println("College Management System");
        d.displayDepartment();
        f.displayFaculty();
        s.displayStudent();
        System.out.println("Static Import sqrt(25): "+sqrt(25));
    }
}