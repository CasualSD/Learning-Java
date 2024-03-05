package _2_classes._1_introduction_to_classes.exercise4;

public class Flat {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Flat(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean largerThan(Flat toCompare){
        if(this.squareMeters > toCompare.squareMeters){
            return false;
        }
        else{ return true; }
    }

    public int priceDifference(Flat toCompare){
        return Math.abs((this.pricePerSquareMeter * squareMeters) - (toCompare.pricePerSquareMeter * toCompare.squareMeters));
    }

    public static boolean largerThan(Flat f1, Flat f2){
        if(f1.squareMeters > f2.squareMeters){
            return false;
        }
        else { return true; }
    }

    public static int priceDifference(Flat f1, Flat f2){
        return Math.abs((f1.pricePerSquareMeter * f1.squareMeters) - (f2.pricePerSquareMeter * f2.squareMeters));
    }

}
