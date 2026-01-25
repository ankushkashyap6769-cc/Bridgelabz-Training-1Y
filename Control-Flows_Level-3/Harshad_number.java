import java.util.Scanner;
class Harshad_number{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your number:- ");
		int number = sc.nextInt();
		int temp=number;
		int sum=0, rev;
		while(temp!=0){
			rev = temp % 10;
			sum = sum + rev;
			temp = temp / 10;
		}
		if(number % sum == 0){
			System.out.print("Harshad Number");
		}
		else{
			System.out.print("Not A Harshad Number");
		}
	}
}