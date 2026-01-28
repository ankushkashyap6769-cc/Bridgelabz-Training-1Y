import java.util.Scanner;
class For_natural_number{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number:- ");
		int number = sc.nextInt();
		if(number == 0 || number < 0){
			System.out.print("Not A Prime Number!!!");
			return;
		}
		int sum = number * (number + 1) / 2;
		int sum2 = 0;
		System.out.println("comuting using For loop...");
		for(int i = number; i>= 0; i--){
			System.out.println("->" + sum2 + " + " + i);
			sum2 = sum2 + i;
		}
		System.out.println("computed using For loop:- " + sum2);
		System.out.print("Computed using formula [n*(n+1)/2]:- " + sum);
	}
}