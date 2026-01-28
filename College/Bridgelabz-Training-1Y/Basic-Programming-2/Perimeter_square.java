import java.util.Scanner;
class Perimeter_square{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Perimeter:- ");
		double perimeter = sc.nextDouble();
		double side = perimeter / 4;
		System.out.print("The Length Of The Side Is " + side + " whose perimeter is " + perimeter);
	}
}