import java.util.Scanner;
class CharType{
static String checkCharacter(char ch){
if(ch>=65&&ch<=90){ch=(char)(ch+32);}
if(ch>=97&&ch<=122){
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){return"Vowel";}
else{return"Consonant";}
}else{return"Not a Letter";}
}
static String[][] analyzeString(String str){
String[][] result=new String[str.length()][2];
for(int i=0;i<str.length();i++){
char ch=str.charAt(i);
result[i][0]=String.valueOf(ch);
result[i][1]=checkCharacter(ch);
}
return result;
}
static void display(String[][] arr){
System.out.println("Character\tType");
for(int i=0;i<arr.length;i++){
System.out.println(arr[i][0]+"\t\t"+arr[i][1]);
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:");
String input=sc.nextLine();
String[][] output=analyzeString(input);
display(output);
sc.close();
}
}
