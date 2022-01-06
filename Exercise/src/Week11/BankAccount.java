package Week11;

public class BankAccount {

    private String name, IC;
    private double balance;

    public BankAccount(String name, String IC, double balance) {
        this.name = name;
        this.IC = IC;
        this.balance = balance;
    }

    public boolean deposit(double a) {
        if (a < 0) {
            return false;
        } else {
            this.balance += a;
            return true;
        }
    }

    public boolean withdraw(double b) {
        if (b > balance) {
            return false;
        } else {
            this.balance -= b;
            return true;
        }
    }

    public void checkBalance(){
        System.out.println("Name: " + name);
        System.out.println("IC: " + IC);
        System.out.println("Balance: " + balance);
    }


}
