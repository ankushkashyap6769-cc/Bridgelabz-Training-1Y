package Generics_And_Collections.Collections;
import java.util.*;
public class ReverseList {
        public static <T> void reverseList(List<T> list){
            int start=0;
            int end=list.size()-1;
            while(start<end){
                T temp=list.get(start);
                list.set(start,list.get(end));
                list.set(end,temp);
                start++;
                end--;
            }
        }
        public static void main(String[] args){
            List<Integer> arrayList=new ArrayList<>(Arrays.asList(1,2,3,4,5));
            System.out.println("Normal ArrayList: "+arrayList);
            reverseList(arrayList);
            System.out.println(" Reversed ArrayList: "+arrayList);
            System.out.println();
            List<Integer> linkedList=new LinkedList<>(Arrays.asList(1,2,3,4,5));
            System.out.println("Normal LinkedList: "+linkedList);
            reverseList(linkedList);
            System.out.println("Rebersed LinkedList: "+linkedList);
        }
}
