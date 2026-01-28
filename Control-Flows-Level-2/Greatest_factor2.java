import java.util.Scanner;
class Greatest_factor2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number:- ");
		int number = sc.nextInt();
		int i = 1;
		int greatestfactor=1;
		if(number>0){
			while(true){
				if(number % i == 0){
					if(i != number){
						greatestfactor = i;
					}
				}
				++i;
				if(i == (number+1)){
					break;
				}
			}
		}
		else{
			System.out.print("Number is not positive");
			return;
		}
		System.out.println("Greatest Factor is " + greatestfactor);
	}
}