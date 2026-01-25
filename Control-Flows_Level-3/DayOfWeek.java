import java.util.Scanner;
class DayOfWeek{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Day:- ");
		int day = sc.nextInt();
		System.out.print("Enter Month:- ");
		int month = sc.nextInt();
		System.out.print("Enter Year:- ");
		int year = sc.nextInt();
		int yo = year - (14 - month) / 12;
		int x = yo + yo/4 - yo/100 + yo/400;
		int mo = month + 12 * ((14-month)/12)-2;
		int d0 = (day + x + (31*mo)/12) % 7;
		if(d0 == 0){
			System.out.print("Sunday");
		}
		else if(d0 == 1){
			System.out.print("Monday");
		}
		else if(d0 == 2){
			System.out.print("Tuesday");
		}
		else if(d0 == 3){
			System.out.print("Wednesday");
		}
		else if(d0 == 4){
			System.out.print("Thursday");
		}
		else if(d0 == 5){
			System.out.print("Friday");
		}
		else{
			System.out.print("Saturday");
		}
	}
}