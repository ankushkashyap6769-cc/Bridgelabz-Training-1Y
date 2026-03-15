package PackageAssignment.library.members;
public class Members{
    public String name;
    int memberId;
    public Members(String name,int memberId){
        this.name=name;
        this.memberId=memberId;
    }
    public void displayMember(){
        System.out.println("Member Name: "+name);
        System.out.println("Member ID: "+memberId);
    }
}