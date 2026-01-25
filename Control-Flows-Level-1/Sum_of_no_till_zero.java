import java.util.Scanner;
class Sum_of_no_til_zero{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		while(true){
			System.out.print("Enter Your Value:- ");
			double number = sc.nextDouble();
			if(number == 0){
				break;
			}
			else{
				sum = sum + number;
			}
		}
		System.out.println("The Total Value IS " + sum );
	}
}
