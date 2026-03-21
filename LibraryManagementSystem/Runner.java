package Encapsulation.LibraryManagementSystem;
import java.util.*;
public class Runner{
    public static void main(String[] args){
        ArrayList<LibraryItem> items=new ArrayList<>();
        items.add(new Book(1,"Java Basics","Author A"));
        items.add(new Magazine(2,"Tech Today","Author B"));
        items.add(new DVD(3,"Movie DHURANDHAR 2","Director ADITYA DHAR"));
        for(LibraryItem item:items){
            item.getItemDetails();
            System.out.println("Loan Duration: "+item.getLoanDuration()+" days");
            Reservable r=(Reservable)item;
            if(r.checkAvailability()){
                r.reserveItem("Ankush Kashyap");
            }
            System.out.println("Available: "+r.checkAvailability());
            System.out.println();
        }
    }
}