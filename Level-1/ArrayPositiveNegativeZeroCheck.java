import java.util.Scanner;
class ArrayPositiveNegativeZeroCheck{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int[] number_array = new int[5];
		System.out.print("Enter 5 Numbers:- ");
		for(int i=0;i<number_array.length;i++){
			number_array[i] = input.nextInt();
		}
		for(int i=0;i<number_array.length;i++){
			if(number_array[i]>0){
				if(number_array[i]%2==0){
					System.out.println("The Number " + number_array[i] + " is Positive and it is Even.");
				}
				else{
					System.out.println("The Number " + number_array[i] + " is Positive and it is Odd.");
				}
			}
			else if(number_array[i] == 0){
				System.out.println("The Number " + number_array[i] + " is Zero");
			}
			else{
				System.out.println("The Number " + number_array[i] + " is Negative.");
			}
		}
		System.out.print("and finally\n");
		if(number_array[0]>number_array[number_array.length-1]){
			System.out.println("The Number " + number_array[0] + " is Greater than " + number_array[number_array.length-1] );
		}
		else if(number_array[0]==number_array[number_array.length-1]){
			System.out.println("The Number " + number_array[0] + " is Equal to " + number_array[number_array.length-1] );
		}
		else{
			System.out.println("The Number " + number_array[0] + " is Less than " + number_array[number_array.length-1] );
		}
	}
}