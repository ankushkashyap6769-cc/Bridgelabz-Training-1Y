package Generics_And_Collections.Collections;
import java.util.*;

public class Equal {
        public static void main(String[] args) {
            Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
            Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
            System.out.println("Are sets equal: " + set1.equals(set2));
        }
}
