import java.util.Scanner;
class Area_triangle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height(in cm):-  ");
		double height = sc.nextDouble();
		System.out.println("Enter Base(in cm):- ");
		double base = sc.nextDouble();
		double area_in_cm2 = 0.5 * base * height;
		double area_in_inch2 = area_in_cm2 / 6.4516;
		System.out.println("The Area Of Triangle In centimeter Square Is " + area_in_cm2 + " and In Inches Square Is " + area_in_inch2);
	}
}