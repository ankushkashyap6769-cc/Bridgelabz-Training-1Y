package Inheritance.Animals;
public class Cat extends Animal{
    public Cat(String name,int age) {
        super(name, age);
    }
    public void makeSound(){
        System.out.println(name+": Meowwwwwwwwww ");
    }
}