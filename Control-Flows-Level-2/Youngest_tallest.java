import java.util.Scanner;
class Youngest_tallest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age of Amar:- ");
		int age_amar = sc.nextInt();
		System.out.print("Enter Height of Amar:- ");
		int height_amar = sc.nextInt();
		System.out.print("Enter Age of Akbar:- ");
		int age_akbar = sc.nextInt();
		System.out.print("Enter Height of Akbar:- ");
		int height_akbar = sc.nextInt();
		System.out.print("Enter Age of Anthony:- ");
		int age_anthony = sc.nextInt();
		System.out.print("Enter Height of Anthony:- ");
		int height_anthony = sc.nextInt();
		if(age_amar < age_akbar && age_amar < age_anthony){
			System.out.print("Amar is Youngest");
		}
		else if(age_akbar<age_amar && age_akbar<age_anthony){
			System.out.println("Akbar is Youngest");
		}
		else{
			System.out.println("Anthony is Youngest");
		}
		if(height_amar>height_akbar && height_amar>height_anthony){
			System.out.println("Amar is Tallest");
		}
		else if(height_akbar>height_amar && height_akbar>height_anthony){
			System.out.println("Akbar is Tallest");
		}
		else{
			System.out.println("Anthony is Tallest");
		}
	}
}