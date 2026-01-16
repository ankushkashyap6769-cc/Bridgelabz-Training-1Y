import java.util.*;
class Ft_to_yd_mile{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Distance(in feets):- ");
		double feet = sc.nextDouble();
		double yard = feet / 3;
		double mile = feet / 5280;
		System.out.print("Your Distance In Feets is " + feet + " while in Yards is " + yard + " and in miles is " + mile);
	}
}