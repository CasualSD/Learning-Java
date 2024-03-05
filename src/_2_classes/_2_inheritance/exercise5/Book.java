package _2_classes._2_inheritance.exercise5;

public class Book extends Item implements Packable {
    public Book(String author, String title, double weight){
        super(author, title, weight);
    }

    public double weight(){
        return super.weight;
    }
}
