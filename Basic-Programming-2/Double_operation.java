import java.util.Scanner;
class Intoperation{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number:- ");
		double first_number = sc.nextDouble();
		System.out.print("Enter Second number:- ");
		double second_number = sc.nextDouble();
		System.out.print("Enter Third Number:- ");
		double third_number = sc.nextDouble();
		double operation1 = first_number + second_number * third_number;
		double operation2 = first_number * second_number + third_number;
		double operation3 = third_number + first_number / second_number;
		double operation4 = first_number % second_number + third_number;
		System.out.print("The Result of a+b*c is " + operation1 + "\nThe Result of a*b+c is " + operation2 + "\nThe Result of c+a/b is " + operation3 + "\nThe Result of a%b+c is " + operation4 );
		
	}
}