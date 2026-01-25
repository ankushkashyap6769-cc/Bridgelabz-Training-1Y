import java.util.Scanner;
class Countdown{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:- ");
		int i = sc.nextInt();
		while(true){
			if(i == -1){
				System.out.println("LIFT OFF!!!");
				break;
			}
			System.out.println(i);
			--i;
		}
	}
}