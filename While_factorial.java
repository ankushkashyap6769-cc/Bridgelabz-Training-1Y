import java.util.Scanner;
class While_factorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number:- ");
		int number = sc.nextInt();
		if(number == 0){
			System.out.print("Factorial is 1");
			return;
		}
		else if(number < 0){
			System.out.print("Can`t Find Factorial For Negative Number");
			return;
		}
		int i = number, factorial = 1;
		while(true){
			factorial = factorial * i;
			--i;
			if(i == 0){
				break;
			}
		}
		System.out.print("The Factorial is " + factorial);
	}
}