package _3_arrays_collections.exercise11;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> inventory;

    public Warehouse(){
        this.prices = new HashMap<>();
        this.inventory = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        prices.put(product, price);
        inventory.put(product, stock);
    }

    public int price(String product){
        if(prices.get(product) == null){
            return -99;
        }
        return prices.get(product);
    }

    public int stock(String product){
        if(inventory.get(product) == null){
            return 0;
        }
        return inventory.get(product);
    }

    public boolean take(String product){
        if(inventory.get(product) == null || inventory.get(product) == 0){
            return false;
        }
        
        int currentStock = inventory.get(product);
        currentStock -= 1;
        inventory.put(product, currentStock);
        return true;
    }

    public Set<String> products(){
        Set<String> currentProducts = new HashSet<>();
        
        for(String item : inventory.keySet()){
            currentProducts.add(item);
        }
        return currentProducts;
    }
}
