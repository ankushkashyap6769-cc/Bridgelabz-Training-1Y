import java.util.Scanner;
class Leap_year{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Year:- ");
		int year = sc.nextInt();
		if(year>=1582){
			if(year%100==0 && year % 400==0){
				if(year%100==0 && year % 400==0){
					System.out.print("Leap Year");
				}
				else{
					System.out.print("Not Leap Year");
				}
			}
			else if(year%4==0){
				System.out.print("Leap Year");
			}
			else{
				System.out.print("Not Leap Year");
			}
		}
		else{
			System.out.print("Not Leap Year");
		}
	}
}