import java.util.Scanner;
class ArrayEvenOdd{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int number = input.nextInt();
		if(number<=0){
			System.out.print("Error");
			return;
		}
		int size = number / 2 + 1;
		int[] array_even = new int[size];
		int[] array_odd = new int[size];
		int index_even=0, index_odd=0;
		for(int i=1;i<=number;i++){
			if(i % 2 == 0){
				array_even[index_even] = i;
				index_even++;
			}
			else{
				array_odd[index_odd] = i;
				index_odd++;
			}
		}
		System.out.println("Even Array: ");
		for(index_even=0;index_even<array_even.length;index_even++){
			if(array_even[index_even]==array_even[array_even.length-1]){
				break;
			}
			System.out.println(array_even[index_even]);
		}
		System.out.println("Odd Array: ");
		for(index_odd=0;index_odd<array_odd.length;index_odd++){
			if(array_odd[index_odd]==array_odd[array_odd.length-1]){
				break;
			}
			System.out.println(array_odd[index_odd]);
		}
		
	}
}