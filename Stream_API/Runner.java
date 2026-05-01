package Stream_API;
import java.util.*;
public class Runner {
    static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(101,78.9,"Ankush"),
                new Student(103,86.4,"Abhishek"),
                new Student(102, 76.5, "Deepak")
        );
        System.out.println(list);
        Collections.sort(list, (Student a, Student b) -> a.id- b.id);
        System.out.println(list);
    }
}
