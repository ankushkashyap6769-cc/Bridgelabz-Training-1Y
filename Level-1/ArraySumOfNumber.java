import java.util.Scanner;
class ArraySumOfNumber{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		double sum = 0.0;
		int i=0;
		System.out.print("Enter Numbers: ");
		while(true){
			array[i]=input.nextDouble();
			if(array[i]<=0){
				break;
			}
			else if(i==9){
				break;
			}
			else{
				i++;
			}
		}
		System.out.print("Your Numbers are:\n");
		for(int j=0;j<array.length;j++){
			if(array[j]<=0){
				break;
			}
			System.out.println(array[j]);
			sum = sum + array[j];
		}
		System.out.println("The Sum is: " + sum);
	}
}