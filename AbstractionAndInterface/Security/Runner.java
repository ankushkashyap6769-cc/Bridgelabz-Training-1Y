package AbstractionAndInterface.Security;
import java.util.*;
public class Runner{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Password: ");
        String password=sc.nextLine();
        if(SecurityUtils.isStrongPassword(password)){
            System.out.println("Strong Password ✅");
        }else{
            System.out.println("Weak Password ❌");
        }
    }
}