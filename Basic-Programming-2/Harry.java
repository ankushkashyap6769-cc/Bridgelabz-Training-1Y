import java.util.Scanner;
class Harry{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Age:- ");
		int birth_year = sc.nextInt();
		System.out.print("Your Birth Year Is:- ");
		System.out.print(2026 - birth_year);
	}
}