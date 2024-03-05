package _2_classes._2_inheritance.exercise3;

public class Application {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog amerettoDog = new Dog("Ameretto");
        amerettoDog.bark();
        amerettoDog.sleep();

        Cat cat = new Cat();
        cat.meow();
        cat.eat();

        Cat garfieldCat = new Cat("Garfield");
        garfieldCat.meow();
        garfieldCat.sleep();

        CanMakeSound interfaceCat = new Cat("interface cat");
        interfaceCat.createSound();

        CanMakeSound interfaceDog = new Dog("interface dog");
        interfaceDog.createSound();
    }
}
