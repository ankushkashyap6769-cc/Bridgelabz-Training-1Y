package Encapsulation.BankingSystem;
public class SavingsAccount extends BankAccount implements Loanable{
    public SavingsAccount(String acc,String name,double balance){
        super(acc,name,balance);
    }
    public double calculateInterest(){
        return getBalance()*0.04;
    }
    public void applyForLoan(double amount){
        if(calculateLoanEligibility()){
            System.out.println("Loan approved: "+amount);
        }else{
            System.out.println("Loan denied");
        }
    }
    public boolean calculateLoanEligibility(){
        return getBalance()>5000;
    }
}