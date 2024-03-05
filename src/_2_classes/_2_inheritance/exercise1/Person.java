package _2_classes._2_inheritance.exercise1;

public class Person {
    protected String fullName;
    protected String address;

    public Person(String fullName, String address){
        this.fullName = fullName;
        this.address = address;
    }

    @Override
    public String toString(){
        return fullName + "\n\t" + address; 
    }

    protected void test(){}
}
