import java.util.Scanner;
class Trimming{
static int[] findTrimIndexes(String str){
int start=0,end=str.length()-1;
while(start<str.length()&&str.charAt(start)==' '){start++;}
while(end>=0&&str.charAt(end)==' '){end--;}
return new int[]{start,end};
}
static String createSubstring(String str,int start,int end){
String result="";
for(int i=start;i<=end;i++){
result=result+str.charAt(i);
}
return result;
}
static boolean compareStrings(String s1,String s2){
if(s1.length()!=s2.length()){return false;}
for(int i=0;i<s1.length();i++){
if(s1.charAt(i)!=s2.charAt(i)){return false;}
}
return true;
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string:");
String input=sc.nextLine();
int[]indexes=findTrimIndexes(input);
String trimmedCustom="";
if(indexes[0]<=indexes[1]){
trimmedCustom=createSubstring(input,indexes[0],indexes[1]);
}
String trimmedBuiltIn=input.trim();
boolean result=compareStrings(trimmedCustom,trimmedBuiltIn);
System.out.println("Custom Trim Result: "+trimmedCustom);
System.out.println("Built-in Trim Result: "+trimmedBuiltIn);
System.out.println("Are both equal? "+result);
sc.close();
}
}
