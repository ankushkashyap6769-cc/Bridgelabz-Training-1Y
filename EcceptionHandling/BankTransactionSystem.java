package EcceptionHandling;

import java.util.Scanner;

public class BankTransactionSystem {
    public static double cash = 6969.67;
    public static void withdrawMoney(double amount){
        if(amount>cash){
            System.out.println("Insufficent Balance");
            throw new IllegalArgumentException();
        }
        if(amount<=0){
            System.out.println("Invalid Amount");
            throw new IllegalArgumentException();
        }
        System.out.println("Withdrwal successful, New Balance: " + (cash - amount));
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Withdrawing Amount: ");
        double amount = sc.nextDouble();
        try{
            withdrawMoney(amount);
        } catch (Exception e) {
            //System.out.println(e.getMessage());
        }
    }
}
