import java.util.Scanner;
class Power{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number:- ");
		int number = sc.nextInt();
		System.out.print("Enter Your Power:- ");
		int power = sc.nextInt();
		int result = 1;
		if(number<0){
			System.out.print("Number is not positive");
			return;
		}
		else{
			for(int i = 1; i<=power;i++){
				result= result*number;
			}
		}
		System.out.print(result);
	}
}