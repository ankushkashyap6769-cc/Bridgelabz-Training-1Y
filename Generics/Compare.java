package Generics_And_Collections.Generics;

public class Compare {
        public static <T> boolean isEqual(T a,T b){
            if(a==null && b==null){
                return true;
            }
            if(a==null || b==null) {
                return false;
            }
            return a.equals(b);
        }
        public static void main(String[] args){
            System.out.println(isEqual(10,10)); // true
            System.out.println(isEqual("Hello","Hello")); // true
            System.out.println(isEqual(10.5,20.5)); // false
        }
}
