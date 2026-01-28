import java.util.Scanner;
class Employee_bonus{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int bonus_amount;
		System.out.print("Enter Your Salary:- ");
		int salary = sc.nextInt();
		System.out.print("Enter Your Years Of Experince:- ");
		int years = sc.nextInt();
		if(years > 5){
			bonus_amount = (salary * 5) / 100;
			System.out.print(" Your Bonus Amount Is:- " + bonus_amount);
		}
		else{
			System.out.print("Sorry you didn't meet the criteria");
		}
	}
}