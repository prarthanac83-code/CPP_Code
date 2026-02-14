import java.util.Scanner;
public class Addition{
    public static void main(String args[]){
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1;i<=10;i++){
            System.out.println(num+"+"+i+"="+(num+i));
        }
    }
}