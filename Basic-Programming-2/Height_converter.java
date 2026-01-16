import java.util.Scanner;
class Height_converter{
	public void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Height(in CM):- ");
		double height_in_cm = sc.nextDouble();
		double height_in_feet = height_in_cm / 30.48;
		double height_in_inch = (height_in_cm % 30.48) / 2.54;
		System.out.println("Your Height In cm is " + height_in_cm + " While In Feet Is " + height_in_feet + " And Inches Is " + height_in_inch);
	}
}