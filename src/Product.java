public class Product {
    
    private final String name;
    private int quantity;
    
    public Product(String name,int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 1)
            this.quantity = 1;
        else
            this.quantity = quantity;
        }
}