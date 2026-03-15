package PackageAssignment.library.books;
public class Books{
    public String title;
    String author;
    public Books(String title,String author){
        this.title=title;
        this.author=author;
    }
    public void displayBook(){
        System.out.println("Book Title: "+title);
        System.out.println("Author: "+author);
    }
}