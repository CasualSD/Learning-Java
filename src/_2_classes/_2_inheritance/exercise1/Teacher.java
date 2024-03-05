package _2_classes._2_inheritance.exercise1;

public class Teacher extends Person{
    private int salary;

    public Teacher(String fullName, String address, int salary){
        super(fullName, address);
        this.salary = salary;
    }

    public String toString(){
        return super.fullName + "\n\t" + super.address + "\n\tsalary " + salary + " euro/month"; 
    }
    
}
