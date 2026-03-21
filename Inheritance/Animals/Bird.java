package Inheritance.Animals;
public class Bird extends Animal{
    public Bird(String name,int age){
        super(name,age);
    }
    public void makeSound(){
        System.out.println(name+": Chi Chi Chu Chu");
    }
}