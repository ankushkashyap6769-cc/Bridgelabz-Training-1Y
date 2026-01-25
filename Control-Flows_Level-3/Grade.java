import java.util.Scanner;
class Grade{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Marks Of Physics:- ");
		int marks_of_physics = sc.nextInt();
		System.out.print("Enter Marks Of Chemistry:- ");
		int marks_of_chemistry = sc.nextInt();
		System.out.print("Enter Marks Of Maths:- ");
		int marks_of_math = sc.nextInt();
		int marks_average = (marks_of_physics + marks_of_chemistry + marks_of_math) / 3;
		if(marks_average>=80){
			System.out.print("\nMarks: " + marks_average + "%\nGrade: A\nRemarks: Level 4, above agency-normalized standars.\n");
		}
		else if(marks_average>=70 && 79>=marks_average){
			System.out.print("\nMarks: " + marks_average + "%\nGrade: B\nRemarks: Level 3, at agency-normalized standars.\n");
		}
		else if(marks_average>=60 && 69>=marks_average){
			System.out.print("\nMarks: " + marks_average + "%\nGrade: C\nRemarks: Level 2, below but approaching agency-normalized standars.\n");
		}
		else if(marks_average>=50 && 59>=marks_average){
			System.out.print("\nMarks: " + marks_average + "%\nGrade: D\nRemarks: Level 1, well below agency-normalized standars.\n");
		}
		else if(marks_average>=40 && 49>=marks_average){
			System.out.print("\nMarks: " + marks_average + "%\nGrade: E\nRemarks: Level 1, too below agency-normalized standars.\n");
		}
		else{
			System.out.print("\nMarks: " + marks_average + "%\nGrade: R\nRemarks: Remedial standars\n");
		}
	}
}