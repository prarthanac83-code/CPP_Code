class main{
    static void greet(){
        System.out.println("Hello from static method...");
    }
    void Farewell(){
        System.out.println("Good-bye from non-static method...");
    }
}
public class Main{
    public static void main(String args[]){
    main obj = new main();
    main.greet();
    obj.Farewell();
    }
}