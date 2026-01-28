import java.util.Scanner;
class Palindrome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number:- ");
		int number = sc.nextInt();
		int temp=number; //121
		int temp2=0;
		while(temp!=0){
			temp2 = temp % 10;
			temp = temp / 10;
			System.out.print(temp2);
		}
	}
}