import java.util.ArrayList;
import java.util.Scanner;

public interface Action1 {
    public static final ArrayList<InventoryItem> inventory = new ArrayList<>();
    public static final Scanner scanner = new Scanner(System.in);
    public static InventoryItem findItemByName(String itemName) {
        for (InventoryItem item : inventory) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }
    void option();


}
