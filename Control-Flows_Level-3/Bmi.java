import java.util.Scanner;
class Bmi{
	public static void main(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Weight(in kg):- ");
		double weight = sc.nextDouble();
		System.out.print("Enter Your Height(in cm):- ");
		double height_in_cm = sc.nextDouble();
		double height_in_meter = height_in_cm/100;
		double bodymassindex = weight / (height_in_meter * height_in_meter);
		if(bodymassindex<18.3){
			System.out.print("Your B.M.I is:- " + bodymassindex + "\nYou Are Underweight");
		}
		else if(bodymassindex>18.4 && 25>bodymassindex){
			System.out.print("Your B.M.I is:- " + bodymassindex + "\nYou Are Normal");
		}
		else if(bodymassindex>25.1 && 40>bodymassindex){
			System.out.print("Your B.M.I is:- " + bodymassindex + "\nYou Are Overweight");
		}
		else{
			System.out.print("Your B.M.I is:- " + bodymassindex + "\nYou Are Obese");
		}
	}
}