import java.util.Scanner;
class Number_check{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number:- ");
		int number = sc.nextInt();
		if(number > 0){
			System.out.print("The number is positive");
		}
		else if(number == 0){
			System.out.print("The Number is zero");
		}
		else{
			System.out.print("The Number Is Negative");
		}
	}
}