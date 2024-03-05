package _2_classes._1_introduction_to_classes.exercise6;

public class Address {
    private String street;
    private int houseNumber;
    private int postalCode;
    private String manuplicity;

    public Address(){}

    public Address(String street, int houseNumber, int postalCode, String manuplicity){
        this.street = street;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.manuplicity = manuplicity;
    }

    public String toString(){
        return " lives in " + street + " " + houseNumber + ", " + postalCode + " " + manuplicity;
    }
}
