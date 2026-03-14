package com.gla.objectsANDclasses.level_2;
import java.util.Scanner;
class MovieTicket{
    String movieName;
    int seatNumber;
    double price;
    void book(String m,int s,double p){
        movieName=m;
        seatNumber=s;
        price=p;
    }
    void display(){
        System.out.println("Movie: "+movieName);
        System.out.println("Seat: "+seatNumber);
        System.out.println("Price: "+price);
    }
}
public class AbsoluteCinema{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MovieTicket t=new MovieTicket();
        System.out.println("movie: ");
        String m=sc.nextLine();
        System.out.println("Seat no: ");
        int s=sc.nextInt();
        System.out.println("Price: ");
        double p=sc.nextDouble();
        t.book(m,s,p);
        t.display();
    }
}