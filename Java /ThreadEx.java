public class ThreadEx{
    public static void main(String[] args) {
        System.out.println("Start");
        try{
        Thread.sleep(2000);
        }catch(InterruptedException e){
        System.out.println("Thread InterruptedException");
    }
    System.out.println("End");
    }
}
