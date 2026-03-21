package Encapsulation.LibraryManagementSystem;
public class DVD extends LibraryItem implements Reservable{
    private boolean available=true;
    private String borrowerName;
    public DVD(int id,String title,String author){
        super(id,title,author);
    }
    public int getLoanDuration(){
        return 3;
    }
    public void reserveItem(String borrowerName){
        if(available){
            this.borrowerName=borrowerName;
            available=false;
            System.out.println("DVD reserved by "+borrowerName);
        }else{
            System.out.println("DVD not available");
        }
    }
    public boolean checkAvailability(){
        return available;
    }
}