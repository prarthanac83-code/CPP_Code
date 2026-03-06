
class Bike{
    int speed; 

    Bike(){
        System.out.println("Speed is:" +speed);        
    }

    {
        speed = 100;
    }
}

public class Initializer {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        Bike b2 = new Bike();
    }   
}
