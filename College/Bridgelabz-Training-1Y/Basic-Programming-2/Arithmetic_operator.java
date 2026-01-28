import java.util.Scanner;
class Operators{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Value:-");
		int a = sc.nextInt();
		System.out.print("Enter Your Value:-");
		int b = sc.nextInt();
		System.out.println("A + B" + (a + b));
		System.out.println("A - B" + (a - b));
		System.out.println("A + B" + (a * b));
		System.out.println("A / B" + (a / b));
		System.out.print("A % B" + (a % b));
	}
}