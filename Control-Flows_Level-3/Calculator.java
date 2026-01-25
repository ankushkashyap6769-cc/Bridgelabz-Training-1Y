import java.util.Scanner;
class Calculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your First Digit:- ");
		double first_digit = sc.nextDouble();
		System.out.print("Enter Your Second Digit:- ");
		double second_digit = sc.nextDouble();
		System.out.print("choose Operator:-\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n->");
		int operator = sc.nextInt();
		switch(operator){
			case 1:{
				System.out.print("The Addition is:- " + (first_digit + second_digit));
				break;
			}
			case 2:{
				System.out.print("The Subtraction is:- " + (first_digit - second_digit));
				break;
			}
			case 3:{
				System.out.print("The Multiplication is:- " + (first_digit * second_digit));
				break;
			}
			case 4:{
				if(second_digit!=0){
					System.out.print("The Division is:- " + (first_digit / second_digit));
					break;
				}
				else{
					System.out.print("Can`t Divide By Zero");
					break;
				}
			}
		}
	}
}