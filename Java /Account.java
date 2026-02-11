class Main{
    int acc_no;
    String name;
    float amount;

    void insert(int a,String n,float amt){
        acc_no = a;
        name = n;
        amount = amt;
    }

    void deposit(float amt){
        amount = amount + amt;
        System.out.println(amt +"deposit");
    }

    void withdraw(float amt){
        if(amount<amt){
            System.out.println("Insufficient balance...");
        }else{
            amount = amount - amt;
            System.out.println(amt+"Withdrawn");
        }
    }
    void checkBalance(){
        System.out.println("balance is "+amount);
    }
    void display(){
        System.out.println(acc_no +" "+ name + " "+ amount );
    }
}

class Account{
    public static void main(String args[]){
       Main a1 = new Main();
        a1.insert(12345,"John",10000);
        a1.display();
        a1.checkBalance();
        a1.deposit(15000);
        a1.checkBalance();
        a1.withdraw(25000);
        a1.checkBalance();
    }
}

