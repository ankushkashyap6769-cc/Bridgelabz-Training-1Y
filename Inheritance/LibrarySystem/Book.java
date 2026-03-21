package Inheritance.LibrarySystem;
public class Book{
    protected String title;
    protected int publicationYear;
    public Book(String title,int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }
    public void displayInfo(){
        System.out.println("Title: "+title);
        System.out.println("Publication Year: "+publicationYear);
    }
}