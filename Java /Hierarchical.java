//Hierarchical inheritance
class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}
class Cat extends Dog{
    void Meow(){
        System.out.println("Meowing...");
    }
} 
public class Hierarchical {
    public static void main(String args[]){
        Cat c = new Cat();
        c.eat();
        c.bark();
        c.Meow();
    }    
}
