import java.util.Scanner;
public class FriendsName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers of friends:");
        int n = sc.nextInt();
        sc.nextLine();
        HashSet<String>namesSet = new Hashset<>();
        for(int i = 0;i<n;i++){
            System.out.println("Enter name"+(i+1)+":");
            String name = sc.nextLine();
            namesSet.add(name);
        }
        TreeSet<String> SortedNames = new TreeSet<>(namesSet);
        System.out.println("\nNames in Ascending Order:\n");
        for(String name : SortedNames){
            System.out.println(name);
        }
        sc.close();
    }
}
