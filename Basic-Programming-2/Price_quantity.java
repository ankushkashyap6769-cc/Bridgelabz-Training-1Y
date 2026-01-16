import java.util.Scanner;
class Price_quantity{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Unit Price:- ");
		double unit_price = sc.nextDouble();
		System.out.print("Enter Quantity:- ");
		int quantity = sc.nextInt();
		double total_price = unit_price * quantity;
		System.out.print("The Total Price In INR is " + total_price + " if the quantity is " + quantity + " and the unit price is " + unit_price);
	}
}