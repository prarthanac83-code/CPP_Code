//error

class student{
    int id;
    String name;
    static String college = "ITS";

    student(int i,String n){
        id = i;
        name = n;
    }
    void display(){
    System.out.println(id +" "+name+" "+college);
    }   

public class Student{
    public static void main(String args[]){
        student s1 = new student(101,"Nick");
        student s2 = new student(102,"Jack");

        s1.show();
        s2.show();
    }
}
}