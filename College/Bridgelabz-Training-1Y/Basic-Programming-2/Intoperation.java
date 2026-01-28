import java.util.Scanner;
class Intoperation{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number:- ");
		int first_number = sc.nextInt();
		System.out.print("Enter Second number:- ");
		int second_number = sc.nextInt();
		System.out.print("Enter Third Number:- ");
		int third_number = sc.nextInt();
		int operation1 = first_number + second_number * third_number;
		int operation2 = first_number * second_number + third_number;
		int operation3 = third_number + first_number / second_number;
		int operation4 = first_number % second_number + third_number;
		System.out.print("The Result of a+b*c is " + operation1 + "\nThe Result of a*b+c is " + operation2 + "\nThe Result of c+a/b is " + operation3 + "\nThe Result of a%b+c is " + operation4 );
		
	}
}