class Student{
    private int id;
    private String name;

    public Student(int i,String n ){
        id = i;
        name = n;
        System.out.println("Student created...");
    }

    void insert(int i,String n){
        id = i;
        name = n;
    }

    void show(){
        System.out.println("Id: " + id );
        System.out.println("Name: " + name ); 
    }
}
public class ConstructorExp{
    public static void main(String args[]){
        Student s1 = new Student(101,"Nick");
        Student s2 = new Student(102,"Jack");

        s1.show();
        s2.show();
    }
}