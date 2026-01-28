import java.util.Scanner;
class Table{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number Between 6 to 9:- ");
		int number = sc.nextInt();
		if(number > 5 && number < 10){
			for(int i =1; i<=10;i++){
				System.out.println(number + " X " + i + " = " + (i*number));
			}
		}
		else{
			System.out.print("Wrong Input");
		}
	}
}