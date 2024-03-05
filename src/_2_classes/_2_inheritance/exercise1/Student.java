package _2_classes._2_inheritance.exercise1;

public class Student extends Person {
    private int credits;

    public Student(String fullName, String address){
        super(fullName, address);
        this.credits = 0;
    }

    public int getCredits(){
        return credits;
    }

    public void study(){
        credits++;
    }

    @Override
    public String toString(){
        return super.fullName + "\n\t" + super.address + credits;
    }
}
