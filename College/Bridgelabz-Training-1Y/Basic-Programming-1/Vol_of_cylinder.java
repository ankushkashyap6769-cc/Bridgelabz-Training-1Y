import java.util.Scanner;
class Vol_of_cylinder{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius:- ");
		int radius = sc.nextInt();
		System.out.print("Enter Height:- ");
		int height = sc.nextInt();
		System.out.print("Volume Of Cylinder is:- ");
		System.out.print((22/7)*radius*radius*height);
	}
}