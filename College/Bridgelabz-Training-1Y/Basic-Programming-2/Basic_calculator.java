import java.util.Scanner;
class Basic_calculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First Digit:- ");
		int number1 = sc.nextInt();
		System.out.println("Enter Your Second Digit:- ");
		int number2 = sc.nextInt();
		int additon = number1 + number2;
		int subtraction = number1 - number2;
		int multiplication = number1 * number2;
		double divison = number1 / number2;
		System.out.println("The Addition, Subtraction, Multiplication and Division of 2 Numbers " + number1 + " and " + number2 + " is " + additon + " , " + subtraction + " , " + multiplication + " and " + divison);
	}
}