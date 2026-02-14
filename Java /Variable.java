class Main{
    int id;
    String name;
    static String college = "ITS";

    Main(int i,String n){
        id = i;
        name = n;
    }
    void display(){
    System.out.println(id +" "+name+" "+college);
    }   
} 
public class Variable{
    public static void main(String args[]){
        Main m1 = new Main(101,"Nick");
        Main m2 = new Main(102,"Jack");

        m1.display();
        m2.display();
    }
}
