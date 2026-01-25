import java.util.Scanner;
class Natural_number{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number:- ");
		int number = sc.nextInt();
		int sum = number * (number + 1) / 2;
		if(number > 0){
			System.out.print("The sum of " + number + " natural number is " + sum);
		}
		else{
			System.out.print("The Number " + number + " is not a natural number");
		}
	}
}