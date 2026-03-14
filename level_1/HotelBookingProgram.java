package com.gla.objectsANDclasses.level_1;
import java.util.Scanner;
class HotelBooking{
    String guestName;
    String roomType;
    int nights;
    HotelBooking(){
        guestName="Guest";
        roomType="Standard";
        nights=1;
    }
    HotelBooking(String g,String r,int n){
        guestName=g;
        roomType=r;
        nights=n;
    }
    HotelBooking(HotelBooking h){
        guestName=h.guestName;
        roomType=h.roomType;
        nights=h.nights;
    }
    void display(){
        System.out.println("Guest: "+guestName);
        System.out.println("Room: "+roomType);
        System.out.println("Nights: "+nights);
    }
}
public class HotelBookingProgram{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HotelBooking b1=new HotelBooking();
        System.out.println("Guest Name: ");
        String g=sc.nextLine();
        System.out.println("Room type: ");
        String r=sc.nextLine();
        System.out.println("How many night :");
        int n=sc.nextInt();
        HotelBooking b2=new HotelBooking(g,r,n);
        HotelBooking b3=new HotelBooking(b2);
        b1.display();
        b2.display();
        b3.display();
    }
}