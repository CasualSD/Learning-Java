package _3_arrays_collections.exercise11;

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart extends Item{

    private List<Item> items;
    private List<String> registeredItemNames;

    public ShoppingCart(){
        this.items = new ArrayList<Item>();
        this.registeredItemNames  = new ArrayList<String>();
    }

    public void add(String product, int price){
        Item item = new Item(product, 1, price);

        if(registeredItemNames.contains(product)){
            for(Item exsistingItem : items){
                if(exsistingItem.product.equals(product)){
                    exsistingItem.increaseQuantity();
                }
            }
        }
        else{
            items.add(item);
            registeredItemNames.add(product);
        }
    }

    public int price(){
        int total = 0;
        for(Item item : items){
            total += item.price();
        }
        return total;
    }

    public void print(){
        for(Item item : items){
            System.out.println(item.toString());
        }
    }
}
