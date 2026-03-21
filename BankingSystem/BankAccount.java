package Encapsulation.BankingSystem;
public abstract class BankAccount{
    private String accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(String accountNumber,String holderName,double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getHolderName(){
        return holderName;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
        }else{
            System.out.println("Insufficient balance");
        }
    }
    public abstract double calculateInterest();
}