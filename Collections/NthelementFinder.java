package Generics_And_Collections.Collections;
import java.util.*;
public class NthelementFinder {
        public static <T> T findNthFromEnd(LinkedList<T> list,int n){
            if(n<=0 || n>list.size()){
                return null;
            }
            Iterator<T> fast=list.iterator();
            Iterator<T> slow=list.iterator();
            for(int i=0;i<n;i++){
                if(fast.hasNext()){
                    fast.next();
                }
            }
            T result=null;
            while(fast.hasNext()){
                fast.next();
                result=slow.next();
            }
            if(result==null){
                result=slow.next();
            }
            return result;
        }
        public static void main(String[] args){
            LinkedList<String> list=new LinkedList<>(Arrays.asList("A","B","C","D","E"));
            int n=2;
            System.out.println("Nth from end: "+findNthFromEnd(list,n));
        }
}
