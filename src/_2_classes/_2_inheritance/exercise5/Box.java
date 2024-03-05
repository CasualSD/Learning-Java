package _2_classes._2_inheritance.exercise5;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private List<Item> items;
    private double maxWeight;

    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<Item>();
    }

    private double weight(){
        double sumWeight = 0;
        for (Item item : items) {
            sumWeight += item.weight;
        }
        return sumWeight;
    }

    public void add(Item item){
        if(item == null){
            System.out.println("Not a valid item");
        }
        else if(items.size() < 3 && weight() + item.weight <= maxWeight){
            items.add(item);
        }
        else{
            System.out.println("Can't add item due to max box size of 3 or item exceeds weight limit.");
        }
    };

    public String toString(){
        return "Box: " + items.size() + " item(s), total weight " + weight() + " kg";
    }
}
