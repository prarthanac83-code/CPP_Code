interface printable{
    void print(); 
    }
class print implements printable{
   public void print(){
   System.out.println("hello...");
   }
}
public class Interface {
    public static void main(String[] args) {
        printable p = new print();
        p.print();
    }   
}
