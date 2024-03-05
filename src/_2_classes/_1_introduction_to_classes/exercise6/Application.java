package _2_classes._1_introduction_to_classes.exercise6;

public class Application {

    public static void main(String[] args) {
        User userOne = new User("Noah", "Maes", 20);

        System.out.println(userOne);
        userOne.addAddress("Modelaan", 15, 3130, "Kankerstad");
        System.out.println(userOne);
    }
}
