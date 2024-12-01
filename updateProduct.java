
public class updateProduct extends HardwareItem {
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
