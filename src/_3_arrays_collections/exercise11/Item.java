package _3_arrays_collections.exercise11;

public class Item {
    protected String product;
    private int quantity;
    private int unitPrice;

    public Item(){}

    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.quantity = qty;
        this.unitPrice = unitPrice;
    }

    public int price(){
        return quantity * unitPrice;
    }

    public void increaseQuantity(){
        quantity++;
    }

    public String toString(){
        return product + ": " + quantity;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((product == null) ? 0 : product.hashCode());
        result = prime * result + quantity;
        result = prime * result + unitPrice;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Item other = (Item) obj;
        if (product == null) {
            if (other.product != null)
                return false;
        } else if (!product.equals(other.product))
            return false;
        if (quantity != other.quantity)
            return false;
        if (unitPrice != other.unitPrice)
            return false;
        return true;
    }
}
