import java.util.Scanner;
class Prime_number{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number:- ");
		int number = sc.nextInt();
		if(number<=1){
			System.out.print("Not Prime Number");
			return;
		}
		boolean isPrime = true;
		for(int i=2;i*i<=number;i++){
			if(number % i == 0){
				isPrime = false;
				break;
			}
		}
		if(isPrime){
			System.out.print("Prime Number");
		}
		else{
			System.out.print("Not Prime");
		}
	}
}