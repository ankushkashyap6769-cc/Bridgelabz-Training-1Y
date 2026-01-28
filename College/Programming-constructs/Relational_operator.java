import java.util.Scanner;
class Relational_operator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Value:-");
		int a = sc.nextInt();
		System.out.print("Enter Your Value:-");
		int b = sc.nextInt();
		if(a == b){
			System.out.println("A == B");
		}
		if(a != b){
			System.out.println("A is not equal B");
		}
		if(a >= b){
			System.out.println("A >= B");
		}
		if(a <= b){
			System.out.println("A <= B");
		}
	}
}