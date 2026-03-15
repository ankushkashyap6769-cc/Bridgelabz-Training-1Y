package PackageAssignment.com.access.two;
import PackageAssignment.com.access.one.Base;
public class Derived extends Base{
    public void testAccess(){
        publicMethod();
        protectedMethod();
    }
}