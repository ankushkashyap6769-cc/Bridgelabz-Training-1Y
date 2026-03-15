package PackageAssignment.com.company.analytics;
import PackageAssignment.com.company.analytics.sales.SalesReport;
import PackageAssignment.com.company.analytics.hr.EmployeeReport;
public class Runner{
    public static void main(String[] args){
        SalesReport s=new SalesReport();
        EmployeeReport e=new EmployeeReport();
        System.out.println("Company Analytics Report");
        s.displaySales();
        e.displayEmployees();
    }
}
