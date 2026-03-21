package Inheritance.Animals;
import java.util.*;
public class Runner{
    public static void main(String[] args){
        ArrayList<Animal> animals=new ArrayList<>();
        animals.add(new Dog("Dogesh",3));
        animals.add(new Cat("Billu",2));
        animals.add(new Bird("Mitthu",1));
        for(Animal a:animals){
            a.display();
            a.makeSound();
            System.out.println();
        }
    }
}