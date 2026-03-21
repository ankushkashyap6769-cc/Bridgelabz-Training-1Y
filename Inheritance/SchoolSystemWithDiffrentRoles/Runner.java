package Inheritance.SchoolSystemWithDiffrentRoles;
public class Runner{
    public static void main(String[] args){
        Person p1=new Teacher("Tanmay",26,"Java");
        Person p2=new Student("Ankush",19,"Graduating");
        Person p3=new Staff("Pappu",40,"Administration");
        Person[] people={p1,p2,p3};
        for(Person p:people){
            p.display();
            if(p instanceof Teacher){
                ((Teacher)p).displayRole();
            }
            else if(p instanceof Student){
                ((Student)p).displayRole();
            }
            else if(p instanceof Staff){
                ((Staff)p).displayRole();
            }
            System.out.println();
        }
    }
}