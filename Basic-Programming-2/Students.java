import java.util.Scanner;
class Students{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of pens:- ");
		int pen = sc.nextInt();
		System.out.print("Enter no. of students:- ");
		int std = sc.nextInt();
		int rem, que;
		rem = pen % std;
		que = pen / std;
		System.out.print("The Pen Per Student Is " + rem + " And The Remaining Pen Not Distributed Is " + que);
	}
}