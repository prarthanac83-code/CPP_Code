class Bike{
    void run(){
        System.out.println("Bike is a vehicle...");
    }
}
class Splendor extends Bike{
    void run(){
        System.out.println("Splendor is a bike...");
    }
}
public class Upcasting {
    public static void main(String[] args) {
        Bike b = new Splendor();
        b.run();
    }
}
