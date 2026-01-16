import java.util.Scanner;
class Simple_intrest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principal:- ");
		int principal = sc.nextInt();
		System.out.print("Enter Rate:- ");
		int rate = sc.nextInt();
		System.out.print("Enter Time:- ");
		int time = sc.nextInt();
		System.out.print("Simple Intrest Is:- ");
		System.out.print((principal*rate*time)/100);
	}
}