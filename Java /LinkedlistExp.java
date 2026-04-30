import java.util.Collections;
import java.util.LinkedList;

public class Linked {
    public static void main(String args[]){
        LinkedList<String> a1 = new LinkedList();

        a1.add("Alice");
        a1.add("Bob");
        a1.add("cherry");
        
        Collections.sort(a1);
        System.out.println(a1); // used to sort the list
    }
}