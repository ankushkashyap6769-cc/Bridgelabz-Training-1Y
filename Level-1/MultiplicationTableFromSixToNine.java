import java.util.Scanner;
class MultiplicationTableFromSixToNine{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number From 6 To 9: ");
		int number = input.nextInt();
		if(number<=5){
			System.out.print("Invalid Response");
			return;
		}
		else if(10<=number){
			System.out.print("Invalid Response");
			return;
		}
		int[] multiplicationresult = new int[11];
		for(int i=1;i<=10;i++){
			multiplicationresult[i] = number*i;
		}
		for(int i=1;i<multiplicationresult.length;i++){
			System.out.println(number + " X " + i + " = " + multiplicationresult[i]);
		}
	}
}