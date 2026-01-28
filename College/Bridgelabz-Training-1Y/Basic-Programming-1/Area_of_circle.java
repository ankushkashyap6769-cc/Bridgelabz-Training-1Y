import java.util.Scanner;
class Area_of_circle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius:- ");
		int radius = sc.nextInt();
		System.out.print("Area Of Circle is:- ");
		System.out.print(2*(22/7)*radius);
	}
}