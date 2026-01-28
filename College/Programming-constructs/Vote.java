import java.util.Scanner;
class No_of_ppl_vote{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number OF People To Check:- ");
		int no_of_people = sc.nextInt();
		for(int i = 1; i <= no_of_people ; i++){
			System.out.print("Enter Age OF Person " + i + ":- ");
			int age = sc.nextInt();
			if(age>18){
				System.out.println("Elgibile To Vote");
			}
			else{
				System.out.println("Not Elgibile");
			}
			
		}
	}
}