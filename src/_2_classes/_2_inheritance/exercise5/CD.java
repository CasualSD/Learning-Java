package _2_classes._2_inheritance.exercise5;

public class CD extends Item implements Packable{
    public CD(String artist, String nameCD, int publicationYear){
        super(nameCD, nameCD, 0.1, publicationYear);
    }

    public double weight(){
        return super.weight;
    }
}
