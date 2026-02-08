import java.util.Scanner;
class ArrayReverse{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		int temp_number = number;
		int count =0;
		while(temp_number!=0){
			temp_number=temp_number/10;
			count ++;
		}
		int[] array = new int[count];
		for(int i=0;i<array.length;i++){
			array[i]=number%10;
			number=number/10;
		}
		System.out.print("Reversed Array: ");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
	}
}