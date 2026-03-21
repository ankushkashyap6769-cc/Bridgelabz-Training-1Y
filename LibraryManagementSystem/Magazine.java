package Encapsulation.LibraryManagementSystem;
public class Magazine extends LibraryItem implements Reservable{
    private boolean available=true;
    private String borrowerName;
    public Magazine(int id,String title,String author){
        super(id,title,author);
    }
    public int getLoanDuration(){
        return 7;
    }
    public void reserveItem(String borrowerName){
        if(available){
            this.borrowerName=borrowerName;
            available=false;
            System.out.println("Magazine reserved by "+borrowerName);
        }else{
            System.out.println("Magazine not available");
        }
    }
    public boolean checkAvailability(){
        return available;
    }
}