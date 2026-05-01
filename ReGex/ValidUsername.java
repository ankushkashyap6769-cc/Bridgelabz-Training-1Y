package ReGex;
import java.util.Scanner;
public class ValidUsername{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter username: ");
        String username=sc.nextLine();
        if(username.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$")) {
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}