import java.util.Scanner;
class While_natural_number{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number:- ");
		int number = sc.nextInt();
		if(number == 0 || number < 0){
			System.out.print("Not A Natural Number!!!");
			return;
		}
		int sum = number * (number + 1) / 2;
		int i = number;
		int sum2 = 0;
		System.out.println("comuting using while loop...");
		while(true){
			System.out.println("->" + sum2 + " + " + i);
			sum2 = sum2 + i;
			--i;
			if(i == 0){
				break;
			}
		}
		System.out.println("computed using while loop:- " + sum2);
		System.out.print("Computed using formula [n*(n+1)/2]:- " + sum);
	}
}