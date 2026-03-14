package com.gla.objectsANDclasses.level_2;
import java.util.Scanner;
class PalindromeChecker{
    String text;
    boolean check(){
        String rev="";
        for(int i=text.length()-1;i>=0;i--){
            rev=rev+text.charAt(i);
        }
        if(text.equals(rev)){
            return true;
        }
        return false;
    }
    void display(){
        if(check()){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
public class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        PalindromeChecker p=new PalindromeChecker();
        System.out.println("Enter text:");
        p.text=sc.nextLine();
        p.display();
    }
}