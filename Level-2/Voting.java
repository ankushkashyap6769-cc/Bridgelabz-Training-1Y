import java.util.Scanner;
class Voting{
static int[] getAges(int n){
Scanner sc=new Scanner(System.in);
int[] ages=new int[n];
for(int i=0;i<n;i++){
System.out.print("Enter age of student "+(i+1)+": ");
ages[i]=sc.nextInt();
}
return ages;
}
static String[][] checkEligibility(int[] ages){
String[][] result=new String[ages.length][2];
for(int i=0;i<ages.length;i++){
int age=ages[i];
result[i][0]=String.valueOf(age);
if(age<0){
result[i][1]="false";
}else if(age>=18){
result[i][1]="true";
}else{
result[i][1]="false";
}
}
return result;
}
static void display(String[][] arr){
System.out.println("Age\tCanVote");
for(int i=0;i<arr.length;i++){
System.out.println(arr[i][0]+"\t"+arr[i][1]);
}
}
public static void main(String[]args){
int numberOfStudents=10;
int[] ages=getAges(numberOfStudents);
String[][] result=checkEligibility(ages);
display(result);
}
}
