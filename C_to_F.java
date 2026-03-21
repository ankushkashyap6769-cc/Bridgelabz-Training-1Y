import java.util.Scanner;
class C_to_F{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value Of Celsius:- ");
		int celsius = sc.nextInt();
		System.out.print("Fahrenheit:- ");
		System.out.print((celsius*9/5)+32);
	}
}