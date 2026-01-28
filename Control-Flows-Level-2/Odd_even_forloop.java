import java.util.Scanner;
class Odd_even_forloop{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number:- ");
		int number = sc.nextInt();
		if(number == 0 || number < 0){
			System.out.print("Not A Natural Number!!!");
			return;
		}
		for(int i = 1; i<= number;i++){
			if( i % 2 == 0){
				System.out.println(i + " is Even");
			}
			else if( i % 2 != 0){
				System.out.println(i + " is Odd");
			}
		}
	}
}