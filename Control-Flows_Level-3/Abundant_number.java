import java.util.Scanner;
class Abundant_number{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your number:- ");
		int number = sc.nextInt();
		int sum=0;
		for(int i=1;i<number;i++){
			if(number % i == 0){
				sum = sum + i;
			}
		}
		if(sum>number){
			System.out.print("Abundant Number");
		}
		else{
			System.out.print("Not Abundant Number");
		}
	}
}