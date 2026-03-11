//Dynamic Binding
class Animal {
    void eat(){
        System.out.println("Animal is eating...");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating...");
    }
}
public class Dynamic{
    public static void main(String[] args) {
    Animal a = new Dog();
    a.eat();         
    }
}

