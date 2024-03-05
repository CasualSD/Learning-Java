package _2_classes._2_inheritance.exercise5;

public abstract class Item {
    protected String creatorName;
    protected String itemGivenName;
    protected double weight;
    protected int manufactureYear;

    public Item(String creatorName, String itemGivenName, double weight){
        this.creatorName = creatorName;
        this.itemGivenName = itemGivenName;
        this.weight = weight;
        this.manufactureYear = 0;
    }

    public Item(String creatorName, String itemGivenName, double weight, int manufactureYear){
        this.creatorName = creatorName;
        this.itemGivenName = itemGivenName;
        this.weight = weight;
        this.manufactureYear = manufactureYear;
    }

    
    public String toString(){
        if(manufactureYear == 0){
            return creatorName + ": " + itemGivenName;
        } 
        return creatorName + ": " + itemGivenName + "(" + manufactureYear + ")";
    }
}
