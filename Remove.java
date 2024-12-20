import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Remove extends Action{
    public static final Scanner scanner = new Scanner(System.in);
    private final ArrayList<InventoryItem> inventory;
    
    public Remove(ArrayList<InventoryItem> inventory) {
        this.inventory = inventory;
    }
    
    @Override
    public void option(){
        // function for case 4 to remove item

        System.out.println("------------------------------------------------");
        System.out.println("                  REMOVE ITEM              ");
        System.out.println("------------------------------------------------");
        for(InventoryItem item: inventory){
            System.out.println(item);
        }
        System.out.println();
        LoadingScreen.delay();
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();

        boolean itemFound = false;
        // Itong iterator ay para sa InventoryItem object inaallow nya mag loop yung ArrayList natin haha.
        Iterator<InventoryItem> iterator = inventory.iterator();

        while (iterator.hasNext()) {
            InventoryItem item = iterator.next();{
                if (item.getName().equalsIgnoreCase(name)) {
                    /*Remove the item directly*/
                    iterator.remove();
                    itemFound = true;
                    System.out.println("The item is successfully removed.");
                    LoadingScreen.delay();
                    break;
                }
            }
        }
        if (!itemFound) {
            System.out.println("Item not found.");
        }
    }
}
