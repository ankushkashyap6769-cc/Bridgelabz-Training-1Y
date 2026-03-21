package Encapsulation.EmployeeManagementSystem;
import java.util.*;
public class Runner{
    public static void main(String[] args){
        Employee e1=new FullTimeEmployee(223,"Ankush Kashyap",50000);
        Employee e2=new PartTimeEmployee(690,"Aloo gobi",200,80);
        e1.assignDepartment("C.S.E");
        e2.assignDepartment("Catering");
        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        for(Employee e:employees){
            e.displayDetails();
        }
    }
}