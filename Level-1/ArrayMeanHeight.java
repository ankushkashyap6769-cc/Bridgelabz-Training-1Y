import java.util.Scanner;
class ArrayMeanHeight{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double[] array_of_heights = new double[11];
		double sum = 0.0;
		System.out.print("Enter 11 Players Height: ");
		for(int i=0;i<array_of_heights.length;i++){
			array_of_heights[i] = input.nextDouble();
			if(array_of_heights[i]<=0){
				System.out.println("Invalid Height");
				return;
			}
			sum = sum + array_of_heights[i];
		}
		double mean = sum / array_of_heights.length;
		System.out.print("The Mean Height Of Players Are: " + mean);
	}
}