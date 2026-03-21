import java.util.Scanner;
class Perimeter_rectangle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length:- ");
		int length = sc.nextInt();
		System.out.print("Enter Width:- ");
		int width = sc.nextInt();
		System.out.print("Perimeter Is:- ");
		System.out.print(2*(length + width));
		
	}
}