import java.util.Scanner;
class ArrayFizzBuzz{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Number: ");
		int number = input.nextInt();
		if(number<0){
			System.out.print("Number Not Positive");
			return;
		}
		String[] fzbz = {"Fizz" , "Buzz" , "FizzBuzz" };
		for(int i=1;i<=number;i++){
			if(i%3==0 && i%5==0){
				System.out.println(fzbz[2]);
			}
			else if(i%3==0){
				System.out.println(fzbz[0]);
			}
			else if(i%5==0){
				System.out.println(fzbz[1]);
			}
			else{
				System.out.println(i);
			}
		}
	}
}