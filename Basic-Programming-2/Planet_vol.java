import java.util.Scanner;
class Planet_vol{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Planet Radius(in km):- ");
		double radius_in_km = sc.nextDouble();
		double radius_in_mile = radius_in_km *  0.621371;
		double vol_in_km3 = (4/3) * (22/7) * (radius_in_km * radius_in_km * radius_in_km);
		double vol_in_mile3 = (4/3) * (22/7) * (radius_in_mile * radius_in_mile * radius_in_mile);
		System.out.print("The Volume Of Planet In Cubic Kilometers is " + vol_in_km3 + " and Volume In Miles Cube Is " + vol_in_mile3);
	}
}