package com.gla.objectsANDclasses.level_2;
import java.util.Scanner;
class Student{
    String name;
    int rollNumber;
    int marks;
    char grade;
    void calculateGrade(){
        if(marks>=90){
            grade='A';
        }else if(marks>=75){
            grade='B';
        }else if(marks>=60){
            grade='C';
        }else if(marks>=50){
            grade='D';
        }else{
            grade='F';
        }
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Marks: "+marks);
        System.out.println("Grade: "+grade);
    }
}
public class StudentsGrade{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        System.out.println("Enter student Nam: ");
        s.name=sc.nextLine();
        System.out.println("Roll no: ");
        s.rollNumber=sc.nextInt();
        System.out.println("Marks: ");
        s.marks=sc.nextInt();
        s.calculateGrade();
        s.display();
    }
}