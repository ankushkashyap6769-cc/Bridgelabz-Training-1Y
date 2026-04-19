package Generics_And_Collections.Generics;

public class BoxRunner {
        public static void main(String[] args){
            Box<Integer> intBox=new Box<>();
            intBox.set(100);
            System.out.println("Integer: "+intBox.get());
            Box<String> strBox=new Box<>();
            strBox.set("Hello");
            System.out.println("String: "+strBox.get());
            Box<Double> doubleBox=new Box<>();
            doubleBox.set(10.5);
            System.out.println("Double: "+doubleBox.get());
        }
}
