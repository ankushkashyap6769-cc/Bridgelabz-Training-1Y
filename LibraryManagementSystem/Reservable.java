package Encapsulation.LibraryManagementSystem;
public interface Reservable{
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}