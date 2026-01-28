import java.util.Scanner;
class Spring_season{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Month:- ");
		int month = sc.nextInt();
		System.out.print("Enter Day:- ");
		int day = sc.nextInt(); // 20 march to 20 june
		if(month == 3 || month == 4 || month == 5 || month == 6){
			if(month == 3 && day == 31 || month == 5 && day == 31){
				System.out.print("Spring Season");
			}
			else if(month == 3 && day >= 20 || month == 4 && 1 <= day && 31>= day || month == 5 && 1 <= day && 30>= day ||  month == 6 && day <=20){
				System.out.print("Spring Season");
			}
			else{
				System.out.print("not a Spring Season");
			}
		}
		else{
			System.out.print("not a Spring Season");
		}
	}
}