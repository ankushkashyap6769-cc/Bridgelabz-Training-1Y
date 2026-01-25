import java.util.Scanner;
class Armstrong{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number:- ");
		int number = sc.nextInt();
		int c=0, sum=0;
		int temp=number;
		int temp2=number;
		int rev=0;
		int pow = 1;
		while(temp!=0){
			temp=temp/10;
			c++;
		}
		while(temp2!=0){
			rev = temp2 % 10;
			for(int i=1;i<=c;i++){
				pow = pow*rev;
			}
			sum = sum + pow;
			pow = 1;
			temp2 = temp2/10;
		}
		if(number == sum){
			System.out.println("Armstrong Number"); 
		}
		else{
			System.out.println("Not A Armstrong Number");
		}
	}
}