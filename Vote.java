import java.util.Scanner;
class Vote{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Age:- ");
		int age = sc.nextInt();
		if(age>= 18){
			System.out.print("The Person Can Vote");
		}
		else{
			System.out.print("The Person Can NOT Vote");
		}
	}
}