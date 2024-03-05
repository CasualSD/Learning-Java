package _2_classes._1_introduction_to_classes.exercise1;

public class Application {

    public static void main(String[] args) {
        Account firstAccount = new Account("Noah", 100);
        
        System.out.println(firstAccount.balance());
        firstAccount.deposit(20);
        firstAccount.withdraw(40);
        System.out.println(firstAccount.balance());
    }
}
