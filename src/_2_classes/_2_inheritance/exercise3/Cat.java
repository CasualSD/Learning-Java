package _2_classes._2_inheritance.exercise3;

public class Cat extends Animal implements CanMakeSound{
    public Cat(){
        super("Cat");
    }

    public Cat(String name){
        super(name);
    }

    public void meow(){
        System.out.println(super.name + " meows");
    }

    public void createSound(){
        meow();
    }
}
