import java.util.Scanner;
class For_factorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number:- ");
		int number = sc.nextInt();
		int factorial = 1;
		if(number == 0){
			System.out.print("Factorial is 1");
			return;
		}
		else if(number < 0){
			System.out.print("Can`t Find Factorial For Negative Number");
			return;
		}
		for(int i = number; i>=1;i--){
			factorial = factorial*i;
		}
		System.out.print("The Factorial is " + factorial);
	}
}