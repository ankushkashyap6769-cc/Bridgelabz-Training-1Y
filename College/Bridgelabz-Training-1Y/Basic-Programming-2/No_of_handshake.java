import java.util.Scanner;
class No_of_handshake{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number Of Students:- ");
		int no_of_student = sc.nextInt();
		int maximum_handshake = ( no_of_student * ( no_of_student - 1) / 2);
		System.out.print("The Maximum Number Of Handshakes Are:- " + maximum_handshake);
	}
}