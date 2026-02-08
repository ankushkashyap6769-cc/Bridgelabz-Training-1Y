import java.util.Scanner;
class ArrayMultiplicationTable{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int[] array_table = new int[11];
		System.out.print("Enter Number: ");
		int number = input.nextInt();
		for(int i=1;i<=10;i++){
			array_table[i] = number*i;
		}
		for(int i=1;i<array_table.length;i++){
			System.out.println(number + " X " + i + " = " + array_table[i]);
		}
	}
}