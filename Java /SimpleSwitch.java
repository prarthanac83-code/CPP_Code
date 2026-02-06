import java.util.Scanner;
public class SimpleSwitch{
    public static void main(String args[]){
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num){
            case 10:
                System.out.println("10");
            break;
            case 20:
                System.out.println("20");
            break;
            case 30:
                System.out.println("30");
            break;    
            default:
            System.out.println("Invalid input");
            break;    
        }
    }

}