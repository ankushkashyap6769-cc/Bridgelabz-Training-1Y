import java.util.Scanner;
class Smallest_number{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number:- ");
		int num1 = sc.nextInt();
	    System.out.print("Enter Second Number:- ");
	    int num2 = sc.nextInt();
	    System.out.print("Enter Third Number:- ");
	    int num3 = sc.nextInt();
	    if( num2 < num3 && num2 < num1){
			System.out.println(num2 + " Is Smallest");
	    }
	    else if (num3 < num2 && num3 < num1){
			System.out.print(num3 + " Is Smallest");
	    }
	    else{
			System.out.print(num1 + " Is Smallest");
	    }
	}
}
