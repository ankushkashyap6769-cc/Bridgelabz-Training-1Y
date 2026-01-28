import java.util.Scanner;
class Converter{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Kilometer Value:- ");
		double kilometer = sc.nextDouble();
		System.out.print("In Miles:- ");
		System.out.print(kilometer * 1.6);
	}
}