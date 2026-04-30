import java.util.ArrayList;
public class ArraylistExp {
    public static void main(String args[]){
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Bob");
        a1.add("John");
        a1.add("Alice");
        a1.add("Lily");
        a1.add("Nick");
        System.out.println(a1);

        a1.add("Peter");
        System.out.println(a1); //to add new element in the list.

        a1.add(1, "Orange1");
        System.out.println(a1); //to add new element beside the old element in the list.
        
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        System.out.println(num); //to add new integer in the list.

        System.out.println(num.get(1)); //to get int element from the list.
        System.out.println(a1.get(0));  //to get str element from the list.

        ArrayList<String> a2 = new ArrayList<>();
        a2.add("Bob");
        a2.add("John");
        a2.add("Alice");
        a2.add("Lily");
        a2.add("Nick");
        System.out.println(a2);

        a2.remove(1);
        System.out.println(a2);  //to remove the element from the list.

        a2.remove(String.valueOf("Nick"));
        System.out.println(a2);  //to remove the whole element from the list.

        // a2.clear();
        // System.out.println(a2);  *//to clear the whole list.*

        a2.set(1,"Stormi");
        System.out.println(a2); // replace str in the list.

        System.out.println(a2.contains("Lily")); //to check whether the str is present in the list [true]
        System.out.println(a2.contains("Preet"));//to check whether the str is present in the list [false]
    }
}
