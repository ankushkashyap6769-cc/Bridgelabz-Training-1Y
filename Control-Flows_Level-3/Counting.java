import java.util.Scanner;
class Counting{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number:- ");
		int number = sc.nextInt();
		int count=0;
		while(number!=0){
			number=number/10;
			count++;
		}
		System.out.print("Number Count:- " + count);
	}
}