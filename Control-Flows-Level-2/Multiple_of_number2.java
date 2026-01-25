import java.util.Scanner;
class Multiple_of_number2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number:- ");
		int number = sc.nextInt();
		int i = 1;
		if(number<0 || number==0){
			System.out.print("Number is not positive");
			return;
		}
		else if(number > 100){
			System.out.print("Above 100");
			return;
		}
		else{
			while(true){
				if(number % i == 0){
					System.out.println(i);
				}
				++i;
				if(i == 100){
					break;
				}
			}
		}
	}
}