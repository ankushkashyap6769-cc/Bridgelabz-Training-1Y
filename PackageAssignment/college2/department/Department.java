package PackageAssignment.college2.department;
public class Department{
    String deptName;
    String location;
    public Department(String deptName,String location){
        this.deptName=deptName;
        this.location=location;
    }
    public void displayDepartment(){
        System.out.println("Department: "+deptName);
        System.out.println("Location: "+location);
    }
}