package Generics_And_Collections.Generics;

public class PairRunner {
        public static void main(String[] args){
            Pair<String,Integer> student=new Pair<>("Ankush",19);
            System.out.println("Name: "+student.getFirst());
            System.out.println("Age: "+student.getSecond());
        }
}
