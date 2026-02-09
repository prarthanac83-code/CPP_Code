import java.util.Scanner;
public class Continue{
public static void main(String args[]){
    System.out.println("Enter the Number:");
    Scanner sc = new Scanner(System.in);
    int skip = sc.nextInt();
    for(int i=1;i<=10;i++){
        if(i==skip){
        continue;
        }
        System.out.println(i);
        }
    }
}