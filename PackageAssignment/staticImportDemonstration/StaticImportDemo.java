package PackageAssignment.staticImportDemonstration;
import static java.lang.Math.*;
public class StaticImportDemo {
    public static void main(String[] args) {
        double num = 16;
        System.out.println("Square Root: " + sqrt(num));
        System.out.println("Power: " + pow(2,3));
        System.out.println("Maximum: " + max(10,20));
        System.out.println("Minimum: " + min(5,3));
        System.out.println("Absolute Value: " + abs(-15));

    }

}