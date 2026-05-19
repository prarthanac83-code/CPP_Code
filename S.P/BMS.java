import java.util.ArrayList;
import java.util.Scanner;

class BankAccount{
    private String accountName;
    private int accountNumber;
    private double  balance;      
//constructor
public BankAccount( int accountNumber, String accountName, double balance){
    this.accountNumber = accountNumber;
    this.accountName = accountName;
    this.balance = balance;
}
//deposit method
public void deposit(double amount){
    balance += amount;
    System.out.println("Amount Deposited Successfully!");
}
//withdrawal method
public void withdrawal(double amount){
    if(amount <= balance){
        balance-=amount;
        System.out.println("withdrawal Successful!");
    }else{
        System.out.println("Insufficient Balance!");
    }
}
//Display Account details
public void displayAccount(){
    System.out.println("\n AccountNumber:"+accountNumber);
    System.out.println("\n AccountName:"+accountName);
    System.out.println("\n AccountBalance:"+balance);
}
public int getaccountNumber(){
    return accountNumber;
}
}
public class BMS {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<BankAccount> accounts = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdrawl Money");
            System.out.println("4. View Account");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    accounts.add(new BankAccount(accNo, name, balance));

                    System.out.println("Account Created Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int depAcc = sc.nextInt();

                    BankAccount depositAccount = findAccount(accounts, depAcc);

                    if (depositAccount != null) {
                        System.out.print("Enter Deposit Amount: ");
                        double amount = sc.nextDouble();

                        depositAccount.deposit(amount);
                    } else {
                        System.out.println("Account Not Found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int withAcc = sc.nextInt();

                    BankAccount withdrawalAccount = findAccount(accounts, withAcc);

                    if (withdrawalAccount != null) {
                        System.out.print("Enter Withdrawal Amount: ");
                        double amount = sc.nextDouble();

                        withdrawalAccount.withdrawal(amount);
                    } else {
                        System.out.println("Account Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int viewAcc = sc.nextInt();

                    BankAccount viewAccount = findAccount(accounts, viewAcc);

                    if (viewAccount != null) {
                        viewAccount.displayAccount();
                    } else {
                        System.out.println("Account Not Found!");
                    }
                    break;

                case 5:
                    System.out.println("Thank You for Using Bank Management System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }

    // Method to find account
    public static BankAccount findAccount(ArrayList<BankAccount> accounts, int accNo) {

        for (BankAccount acc : accounts) {
            if (acc.getaccountNumber() == accNo) {
                return acc;
            }
        }

        return null;
    }
}