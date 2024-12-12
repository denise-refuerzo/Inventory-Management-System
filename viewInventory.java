import java.util.ArrayList;

public class viewInventory extends Action{
    private final ArrayList<InventoryItem> inventory;
    
    public viewInventory(ArrayList<InventoryItem> inventory) {
        this.inventory = inventory;
    }
    
    @Override
    public void option() {
        System.out.println("------------------------------------------------");
        System.out.println("                  VIEW ITEM              ");
        System.out.println("------------------------------------------------");
        // ito naman ay para sa case 2 to view the item hahahah
        if(inventory.isEmpty()){
            System.out.println("Inventory is empty.");
            LoadingScreen.delay();
        }else{
            System.out.println("Inventory List");
            for(InventoryItem item: inventory){
                System.out.println(item);
            }
        }
    }
}
