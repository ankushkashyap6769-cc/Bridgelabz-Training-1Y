package PackageAssignment.com.company;
import PackageAssignment.com.company.hr.Employee;
import PackageAssignment.com.company.payroll.*;
public class Runner{
    public static void main(String[] args){
        Employee e=new Employee(1251500223,"Ankush Kashyap","CLOUD COMPUTING",50000);
        Payroll p=new Payroll();
        double finalSalary=p.calculateBonus(e);
        System.out.println("Employee ID: "+e.getId());
        System.out.println("Name: "+e.getName());
        System.out.println("Department: "+e.getDepartment());
        System.out.println("Original Salary: "+e.getSalary());
        System.out.println("Salary After Bonus: "+finalSalary);
    }

}