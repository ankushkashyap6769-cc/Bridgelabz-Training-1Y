import java.util.Scanner;
class Profit_loss{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Cost Price:- ");
		double cost_price = sc.nextDouble();
		System.out.print("Enter Your Selling Price:- ");
		double selling_price = sc.nextDouble();
		double profit = selling_price - cost_price;
		double profit_perchantage = (profit / cost_price)*100;
		System.out.print("Your Profit Is:- " + profit);
		System.out.print("\nYour Profit Perchantage Is:- " + profit_perchantage);
	}
}