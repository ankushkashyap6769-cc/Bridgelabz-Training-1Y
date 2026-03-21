package Encapsulation.LibraryManagementSystem;
public class Book extends LibraryItem implements Reservable{
    private boolean available=true;
    private String borrowerName;
    public Book(int id,String title,String author){
        super(id,title,author);
    }
    public int getLoanDuration(){
        return 14;
    }
    public void reserveItem(String borrowerName){
        if(available){
            this.borrowerName=borrowerName;
            available=false;
            System.out.println("Book reserved by "+borrowerName);
        }else{
            System.out.println("Book not available");
        }
    }
    public boolean checkAvailability(){
        return available;
    }
}