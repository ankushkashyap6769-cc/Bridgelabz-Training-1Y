import java.util.Scanner;
class Power2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number:- ");
		int number = sc.nextInt();
		System.out.print("Enter Your Power:- ");
		int power = sc.nextInt();
		int result = 1;
		int i=1;
		if(number<0){
			System.out.print("Number is not positive");
			return;
		}
		else{
			while(true){
				result = result * number;
				if(power == i){
					break;
				}
				++i;
			}
		}
		System.out.print(result);
	}
}