public class HardwareItem extends InventoryItem {
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
