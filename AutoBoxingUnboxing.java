package WrapperClasses;
import java.util.*;
public class AutoBoxingUnboxing{
    public static void autoboxing(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List: " + list);
        int sum=0;
        for(Integer x: list){
            sum=sum+x;
        }
        System.out.println("Sum Is: " + sum);


    }
    static void main(String[] args) {
        autoboxing();
    }
}
