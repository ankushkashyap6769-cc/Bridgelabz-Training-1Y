import java.util.Scanner;
class Assignment_operator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value:- ");
		int a = sc.nextInt();
		System.out.println("A+=5:- " + (a+=5));
		System.out.println("A-=5:- " + (a-=5));
		System.out.println("A*=5:-" + (a*=5));
		System.out.println("A/=5:- " + (a/=5));
		System.out.println("A%=5:- " + (a%=5));
	}
}