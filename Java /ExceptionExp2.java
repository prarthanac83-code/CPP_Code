public class ExceptionExp2 {
    public static void main(String[] args) {
        try{
            int data = 25/5;
            System.out.println(" Error: Division by is not allowed.");
        }finally{
            System.out.println("This block always executes.");
        }
        System.out.println("Program continues the finally block.");
    }
}
