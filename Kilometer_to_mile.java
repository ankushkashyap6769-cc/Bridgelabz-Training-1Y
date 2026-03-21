import java.util.Scanner;
class Kilometer_to_mile{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double miles;
		System.out.print("Enter kilometer:- ");
		double kilometer = sc.nextDouble();
		System.out.print("In Miles:- ");
		miles = kilometer * 0.621371;
		System.out.print(miles);
	}
}