package Inheritance.LibrarySystem;
public class Author extends Book{
    private String authorName;
    private String bio;
    public Author(String title,int publicationYear,String authorName,String bio){
        super(title,publicationYear);
        this.authorName=authorName;
        this.bio=bio;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Author: "+authorName);
        System.out.println("Bio: "+bio);
    }
}