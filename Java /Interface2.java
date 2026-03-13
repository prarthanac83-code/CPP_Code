interface Drawable{
    void draw();
 }

class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing Rectangle...");
    }
} 
class Circle implements Drawable{
    public void draw(){
        System.out.println("Drawing Cirlce...");
    }
} 
public class Interface2 {
    public static void main(String[] args) {
        Drawable d = new Circle();
        d.draw();
        Drawable d1 = new Rectangle();
        d1.draw();
    }
}
