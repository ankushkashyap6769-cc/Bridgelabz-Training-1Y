package PackageAssignment.library.transactions;
import PackageAssignment.library.books.Books;
import PackageAssignment.library.members.Members;
public class Transactions{
    public void issueBook(Books b,Members m){
        System.out.println("Book Issued Successfully");
        System.out.println("Book: "+b.title);
        System.out.println("Issued To: "+m.name);
    }
}