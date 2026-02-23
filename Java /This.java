class Student{
    int rollno;
    String name;
    float fee;
    Student(int rollno,String name,float fee){
     this.rollno = rollno;
     this.name = name;
     this.fee = fee;
    }
    void display(){
        System.out.println(rollno + " " + name + " " + fee + " " );
    }
}
public class This{
    public static void main(String[] args) {
        Student s1 = new Student(101,"Ankit",50000f);
        Student s2 = new Student(102,"Rohan",45000f);
        s1.display();
        s2.display();
    }
    }
