import java.util.Scanner;
class Divisibility_check_5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number:- ");
		int num = sc.nextInt();
		if(num % 5 == 0){
			System.out.println( num + " is Divisble by 5");
		}
		else{
			System.out.println( num + " is not Divisble by 5");
		}
	}
}