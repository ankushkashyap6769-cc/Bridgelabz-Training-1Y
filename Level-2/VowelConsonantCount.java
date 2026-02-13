import java.util.Scanner;
public class VowelConsonantCount{
static String checkCharacter(char ch){
if(ch>=65&&ch<=90){ch=(char)(ch+32);}
if(ch>=97&&ch<=122){
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){return"Vowel";}
else{return"Consonant";}
}else{return"Not a Letter";}
}
static int[] countVowelsAndConsonants(String str){
int vowels=0,consonants=0;
for(int i=0;i<str.length();i++){
char ch=str.charAt(i);
String result=checkCharacter(ch);
if(result.equals("Vowel")){vowels++;}
else if(result.equals("Consonant")){consonants++;}
}
return new int[]{vowels,consonants};
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:");
String input=sc.nextLine();
int[]counts=countVowelsAndConsonants(input);
System.out.println("Number of Vowels: "+counts[0]);
System.out.println("Number of Consonants: "+counts[1]);
sc.close();
}
}
