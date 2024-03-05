package _2_classes._1_introduction_to_classes.exercise1;

public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if(balance - amount > 0){
            balance = balance - amount;
        }
        else {
            System.out.println("Not enough balace.");
        }
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public double balance() {
        return balance;
    }

    @Override
    public String toString() {
        return name + ": " + balance;
    }
}
