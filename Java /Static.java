class Static{
    public static void greet(){
        System.out.println("Good Evening!");
    }
static int age = 20;

public static void main(String[] args){
    Static fe = new Static();
    Static ge = new Static();

    fe.age = 38;
    System.out.println(fe.age);

    ge.age = 48;
    System.out.println(ge.age);

    fe.greet();
    }
}

