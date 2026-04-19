package Generics_And_Collections.Generics;
import java.util.*;
public class NumericSum {
        public static double sumNumbers(List<? extends Number> list){
            double sum=0;
            for(Number n:list){
                sum+=n.doubleValue();
            }
            return sum;
        }
        public static void main(String[] args){

            List<Integer> intList=Arrays.asList(1,2,3,4);
            System.out.println("Sum of Integers: "+sumNumbers(intList));
            List<Double> doubleList=Arrays.asList(1.5,2.5,3.5);
            System.out.println("Sum of Doubles: "+sumNumbers(doubleList));

        }
}
