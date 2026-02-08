import java.util.Scanner;
class ArrayVoteCheck{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int[] age_array = new int[10];
		System.out.print("Enter 10 Students Age:- ");
		for(int i=0;i<age_array.length;i++){
			age_array[i] = input.nextInt();
		}
		for(int i=0;i<age_array.length;i++){
			if(age_array[i]>=18){
				System.out.println("The Student With Age " + age_array[i] + " is Elgible To Vote.");
			}
			else if(age_array[i]<18 && age_array[i]>0){
				System.out.println("The Student With Age " + age_array[i] + " is Not Elgible To Vote.");
			}
			else{
				System.out.println("The Student With Age " + age_array[i] + " is Invalid.");
			}
		}
		
	}		
}