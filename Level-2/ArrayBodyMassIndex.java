import java.util.Scanner;
class ArrayBodyMassIndex{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number Of Persons: ");
		int no_of_person = input.nextInt();
		double[] array_weight = new double[no_of_person];
		double[] array_height = new double[no_of_person];
		double[] array_bmi = new double[no_of_person];
		String[] status = {"Underwight", "Normal", "Overweight", "Obese"};
		for(int i=0;i<no_of_person;i++){
			System.out.print("\nEnter person " + (i+1) );
			System.out.print("\nWeight(in kg): ");
			array_weight[i]=input.nextDouble();
			System.out.print("Height(in cm): ");
			array_height[i]=input.nextDouble();
			array_bmi[i] = (array_weight[i] / (array_height[i]*array_height[i]))*10000;
		}
		for(int i=0;i<no_of_person;i++){
			System.out.print("\nDetails Of Person " + (i+1) + "\nB.M.I: " + array_bmi[i]);
			if(array_bmi[i]<=18.4){
				System.out.print("\nStatus: " + status[0]);
			}
			else if(array_bmi[i]>= 18.4 && array_bmi[i] <=24.9){
				System.out.print("\nStatus: " + status[1]);
			}
			else if(array_bmi[i]>=25.0 && array_bmi[i]<=39.9){
				System.out.print("\nStatus: " + status[2]);
			}
			else{
				System.out.print("\nStatus: " + status[3]);
			}
			System.out.print("\n");
		}
	}
}