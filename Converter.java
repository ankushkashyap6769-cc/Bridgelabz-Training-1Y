import java.util.Scanner;
class Converter{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Kilometer Value:- ");
		double kilometer = sc.nextDouble();
		double miles = kilometer * 0.621371;
		System.out.print("In Miles:- " + miles);
	}
}