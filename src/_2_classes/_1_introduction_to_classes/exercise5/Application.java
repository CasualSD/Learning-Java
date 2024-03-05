package _2_classes._1_introduction_to_classes.exercise5;

public class Application {

    public static void main(String[] args) {
        User userOne = new User("Noah", "Maes");
        User userTwo = new User("Ian", "Maes", 20);

        userTwo.age();

        System.out.println(userOne + "\n" + userTwo);
    }
}
