import java.util.*;
public class FriendsName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Numbers of friends:");
        int n = sc.nextInt();
        sc.nextLine();
        Set<String>namesSet = new HashSet<>();
        for(int i = 0;i<n;i++){
            System.out.println("Enter name"+(i+1)+":");
            String name = sc.nextLine();
            namesSet.add(name);
        }
        Set<String> sortedNames = new TreeSet<>(namesSet);
        System.out.println("\nNames in Ascending Order:\n");
        for(String name : sortedNames){
            System.out.println(name);
        }
        sc.close();
    }
}
