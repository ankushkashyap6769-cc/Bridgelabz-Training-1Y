package Inheritance.LibrarySystem;
public class Runner{
    public static void main(String[] args){
        Author book1=new Author(
                "Java Programming",
                2023,
                "John Smith",
                "Expert in Java development"
        );
        book1.displayInfo();

    }
}