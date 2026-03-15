package PackageAssignment.com.bank;
import PackageAssignment.com.bank.util.InterestCalculator;
public class Runner{
    public static void main(String[] args){
        InterestCalculator ic=new InterestCalculator();
        double p=10000;
        double r=5;
        double t=2;
        double si=ic.calculateSimpleInterest(p,r,t);
        double ci=ic.calculateCompoundInterest(p,r,t);
        System.out.println("Simple Interest: "+si);
        System.out.println("Compound Interest: "+ci);
    }

}