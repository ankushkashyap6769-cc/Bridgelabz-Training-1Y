import java.util.Scanner;
class Discount_fee{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Fees:- ");
		double fee = sc.nextDouble();
		System.out.print("Enter Discount Value:- ");
		double discount = sc.nextDouble();
		double discounted_fee = fee*(discount/100);
		System.out.print("Discounted Price Is:- " + discounted_fee);
		double final_price = fee - discounted_fee;
		System.out.print("\nFinal Price:- " + final_price);
		
		
	
	}
}