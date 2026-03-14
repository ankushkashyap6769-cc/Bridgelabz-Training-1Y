package com.gla.objectsANDclasses.level_1;
import java.util.Scanner;
class EmployeeDetails{
    String name;
    int id;
    double salary;
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Salary: "+salary);
    }
}
public class Employee{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        EmployeeDetails e=new EmployeeDetails();
        System.out.println("Enter Name: ");
        e.name=sc.nextLine();
        System.out.println("Enter ID: ");
        e.id=sc.nextInt();
        System.out.println("Enter Salary: ");
        e.salary=sc.nextDouble();
        e.display();
    }
}