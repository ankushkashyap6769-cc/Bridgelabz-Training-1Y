import java.util.Scanner;
class LargestAndSecondLargest{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int max_digit=10;
		int[] array = new int[10];
		int array_index = 0;
		int largest=0;
		int second_largest=0;
		System.out.print("Enter 9 digit Number: ");
		int number = input.nextInt();
		while(number!=0){
			array[array_index] = number%10;
			array_index++;
			if(array_index==10){
				break;
			}
			number=number/10;
		}
		for(int i=0;i<array.length;i++){
			if(array[i]>largest){
				largest=array[i];
			}
		}
		for(int i=0;i<array.length;i++){ // 5 4 3 2 1 :- if 5>0 treu and 5>5 true again if arr i != largest num then save sceond larget
			if(array[i]>second_largest && largest>second_largest){
				if(array[i]!=largest){
					second_largest=array[i];
				}
			}
		}
		System.out.println("The Largest Number Is: " + largest);
		System.out.println("The Second Largest Is: " + second_largest);
	}
}