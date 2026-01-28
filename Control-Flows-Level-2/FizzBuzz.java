import java.util.Scanner;
class FizzBuzz{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number:- ");
		int number = sc.nextInt();
		if(number>0){
			for(int i = 1; i<=number;i++){
				if(i % 3 == 0 && i % 5 == 0){
					System.out.println("FizzBuzz");
				}
				else if(i % 5 == 0){
					System.out.println("Buzz");
				}
				else if(i % 3 == 0){
					System.out.println("Fizz");
				}
				else{
					System.out.println(i);
				}
			}
		}
		else{
			System.out.print("Number is not positive");
			return;
		}
	}
}