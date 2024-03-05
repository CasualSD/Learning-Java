package _2_classes._1_introduction_to_classes.exercise5;

public class User {
    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, String lastName, int age){
        this(firstName, lastName);
        this.age = age;
    }

    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
    }

    public void age(){
        this.age += 1;
    }
    
    public void age(int number){
        this.age += number;
    }

    public String toString(){
        return this.firstName + " " + this.lastName + " " + this.age;
    }
}
