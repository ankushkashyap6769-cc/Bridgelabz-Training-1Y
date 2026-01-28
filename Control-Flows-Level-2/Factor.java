import java.util.Scanner;
class FizzBuzz_two{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number:- ");
		int number = sc.nextInt();
		if(number>0){
			for(int i=1;i<=number;i++){
				if(number % i == 0){
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