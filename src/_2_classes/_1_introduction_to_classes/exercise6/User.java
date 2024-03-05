package _2_classes._1_introduction_to_classes.exercise6;

public class User extends Address {
    private String firstName;
    private String lastName;
    private int age;
    private Address address;

    public User(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public User(String firstName, String lastName){
        this(firstName, lastName, 0);
    }

    public void addAddress(String street, int houseNumber, int postalCode, String manuplicity){
        this.address = new Address(street, houseNumber, postalCode, manuplicity);
    }

    public void age(){
        this.age += 1;
    }
    
    public void age(int number){
        this.age += number;
    }

    public String toString(){
        return this.firstName + " " + this.lastName + " " + this.age + (address == null ? " : No Adress" : address.toString());
    }
}
