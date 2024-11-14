class InventoryItem{

    private String name;
    private int quantity;
    private double price;

    public InventoryItem(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    
    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "Item: " + name + ", Quantity: " + quantity + ", Price: ₱" + price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class HardwareItem extends InventoryItem{
    private String category;

    public HardwareItem(String name, int quantity, double price, String category){
        super(name, quantity, price);
        this.category = category;
    }

    public String getCategory(){
        return category;
    }

    @Override
    public String toString(){
        return super.toString() + ", Category: " + category;
    }
}

class updateProduct extends HardwareItem {
    private String updateItem;

    public updateProduct(String name, int quantity, double price, String category, String updateItem) {
        super(name, quantity, price, category);
        this.updateItem = updateItem;
    }

    public String getUpdateItem() {
        return updateItem;
    }

    public void setUpdateItem(String updateItem) {
        this.updateItem = updateItem;
    }

    @Override
    public String toString() {
        return super.toString() + ", Update Item: " + updateItem;
    }
}