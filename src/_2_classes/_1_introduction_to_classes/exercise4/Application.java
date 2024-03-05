package _2_classes._1_introduction_to_classes.exercise4;

public class Application {

    public static void main(String[] args) {
        Flat flatOne = new Flat(5,300,1250);
        Flat flatTwo = new Flat(3, 175, 850);

        System.out.println(flatOne.largerThan(flatTwo));
        System.out.println(Flat.largerThan(flatOne, flatTwo));

        System.out.println(flatOne.priceDifference(flatTwo));
        System.out.println(Flat.priceDifference(flatOne, flatTwo));
    }
}
