package Encapsulation.LibraryManagementSystem;
public abstract class LibraryItem{
    private int itemId;
    private String title;
    private String author;
    public LibraryItem(int itemId,String title,String author){
        this.itemId=itemId;
        this.title=title;
        this.author=author;
    }
    public int getItemId(){
        return itemId;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public void getItemDetails(){
        System.out.println("ID: "+itemId);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
    }
    public abstract int getLoanDuration();
}