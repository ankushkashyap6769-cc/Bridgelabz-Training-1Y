package com.gla.objectsANDclasses.level_2;
import java.util.Scanner;
class BankAccount{
    String accountHolder;
    int accountNumber;
    double balance;
    void deposit(double amount){
        balance=balance+amount;
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance=balance-amount;
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    void display(){
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}
public class Bank{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BankAccount b=new BankAccount();
        System.out.println("Account holder name: ");
        b.accountHolder=sc.nextLine();
        System.out.println("Account number: ");
        b.accountNumber=sc.nextInt();
        System.out.println("Balance: ");
        b.balance=sc.nextDouble();
        System.out.println("Deposit amt: ");
        double deposit=sc.nextDouble();
        b.deposit(deposit);
        System.out.println("Withdraw Amt: ");
        double withdraw=sc.nextDouble();
        b.withdraw(withdraw);
        b.display();
    }
}