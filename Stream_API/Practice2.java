package Stream_API;
import java.util.*;
public class Practice2 {
    static void main(String[] args) {
        List<Integer> list = List.of(32,65,98,43,89,545,43,88,45);
        System.out.println("List: " + list);
        list.stream().sorted().toList().forEach(System.out::println);
        System.out.println("Sorted List: " + list);
        list.stream().filter(x -> x%2==0).toList().forEach(System.out::println);
        //System.out.println("Even List: " + list);
        list.stream().filter(x -> x%2!=0).toList().forEach(System.out::println);
    }
}
