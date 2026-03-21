package Encapsulation.BankingSystem;
import java.util.*;
public class Runner{
    public static void main(String[] args){
        ArrayList<BankAccount> accounts=new ArrayList<>();
        accounts.add(new SavingsAccount("S101","Ankush",10000));
        accounts.add(new CurrentAccount("C202","Abhishek",15000));
        for(BankAccount acc:accounts){
            System.out.println("Account: "+acc.getAccountNumber());
            System.out.println("Holder: "+acc.getHolderName());
            acc.deposit(2000);
            acc.withdraw(1000);
            double interest=acc.calculateInterest();
            System.out.println("Interest: "+interest);
            Loanable l=(Loanable)acc;
            l.applyForLoan(50000);
            System.out.println("Balance: "+acc.getBalance());
            System.out.println();
        }
    }
}