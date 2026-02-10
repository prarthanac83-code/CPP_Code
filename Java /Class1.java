class Student{
    int id;
    String name;
    float marks;
    
    public void insert(int i,String n,float m){
    id=i;
    name=n;
    marks=m;
    System.out.println("Student Added...");
    }
    public void show(){
        System.out.println("ID "+id);
        System.out.println("NAME "+name);
        System.out.println("MARKS "+marks);
        }
    }
public class Class1{
public static void main(String args[]){
    Student s1 = new Student();
    s1.insert(101,"John",95.3f);
    Student s2 = new Student();
    s2.insert(102,"Nick",89.4f);
    s1.show();
    s2.show();
}
}

//  Student s1 = new Student();
//   s1.id = 101;
//    s1.name = "John";
//    s1.marks = 90.5f;