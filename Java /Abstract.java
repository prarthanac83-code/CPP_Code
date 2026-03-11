abstract class car{
    public void start(){
        System.out.println("car starting...");
    }
    public void stop(){
        System.out.println("car Stopped...");
    }
    abstract public  void topspeed();
}
class BMW extends car{
    @Override
    public void topspeed(){
        System.out.println("Top speed is 240kmph");
    }
}
class Farari extends car{
    public void topspeed(){
        System.out.println("Top speed is 280kmph");
    }
}
public class Abstract {
    public static void main(String[] args) {
        car c1 = new BMW();
        c1.start();
        c1.stop();
        c1.topspeed();

        car c2 = new Farari();
        c2.start();
        c2.stop();
        c2.topspeed();
    }
}