package _2_classes._2_inheritance.exercise3;

public class Dog extends Animal implements CanMakeSound {
    public Dog(){
        super("Dog");
    }

    public Dog(String name){
        super(name);
    }

    public void bark(){
        System.out.println(super.name + " barks");
    }

    public void createSound(){
        bark();
    }
}
