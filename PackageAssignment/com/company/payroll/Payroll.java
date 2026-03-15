package PackageAssignment.com.company.payroll;
import PackageAssignment.com.company.hr.Employee;
public class Payroll{
    public double calculateBonus(Employee e){
        double bonus=e.getSalary()*0.10;
        double totalSalary=e.getSalary()+bonus;
        return totalSalary;
    }
}