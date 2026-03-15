package PackageAssignment.college;
import PackageAssignment.college.student.Students;
import PackageAssignment.college.faculty.Faculty;
public class Runner{
    public static void main(String[] args) {
        Students s = new Students();
        Faculty f = new Faculty();
        s.displayStudent();
        f.displayFaculty();
    }
}