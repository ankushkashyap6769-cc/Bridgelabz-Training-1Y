package PackageAssignment.library;
import PackageAssignment.library.books.Books;
import PackageAssignment.library.members.Members;
import PackageAssignment.library.transactions.Transactions;
public class Runner{
    public static void main(String[] args){
        Books b=new Books("Java Programming","James Gosling");
        Members m=new Members("Ankush Kashyap",124000432);
        Transactions t=new Transactions();
        b.displayBook();
        m.displayMember();
        t.issueBook(b,m);
    }
}