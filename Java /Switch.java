import java.util.Scanner;
public class Switch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Play\n 2.Setting\n 3.About\n 4.Exit\n enter by your choice :");
        int n = sc.nextInt();
         
        switch(n){
            case 1 :
                System.out.println("Game Started");
            break;    
        
            case 2 :
                System.out.println("Settings opened");
            
                System.out.println("1.Display\n 2.Mouse\n 3.Audio\n 4.Video\n enter by your choice :");
                n = sc.nextInt();
        switch(n){
            case 1 :
                System.out.println("Display setting is opened");
            break;    
            case 2 :
                System.out.println("Mouse setting is opened");
            break;    
            case 3 :
                System.out.println("Audio setting is opened");
            break;
            case 4 :
                System.out.println("Video setting is opened");    
            break;
            }
            break;

            case 3 :
                System.out.println("About setting is opened");
            break; 

            case 4 :
                System.out.println("Game Exited....");  
            break;

            default:
                System.out.println("Invalid Option !");
            break;    
                }    
            }
    }
