import java.util.Scanner;
class Average_of_three{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Fist Number:- ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number:- ");
		int b = sc.nextInt();
		System.out.print("Enter Third Number:- ");
		int c = sc.nextInt();
		System.out.print("Average Is:- ");
		System.out.print((a + b + c)/3);
	}
}