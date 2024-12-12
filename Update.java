import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Update extends Action {
    private static final Scanner scanner = new Scanner(System.in);
    private final ArrayList<InventoryItem> inventory;
    
    public Update(ArrayList<InventoryItem> inventory) {
        this.inventory = inventory;
    }
    
    @Override
    public void option() {
        System.out.println("------------------------------------------------");
        System.out.println("                  UPDATE ITEM                   ");
        System.out.println("------------------------------------------------");
        
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        
        for (InventoryItem item : inventory) {
            System.out.println(item);
        }
        
        System.out.println();
        System.out.print("Enter product name: ");
        String itemName = scanner.nextLine();

        InventoryItem itemToUpdate = findItemByName(itemName);

        if (itemToUpdate == null) {
            System.out.println("Product not found in inventory.");
            return;
        }

        System.out.print("Do you want to update this product? (Y/N): ");
        String updateChoice = scanner.nextLine();

        if (updateChoice.equalsIgnoreCase("Y")) {
            System.out.print("Enter new quantity: ");
            int newQuantity = scanner.nextInt();
            System.out.print("Enter new price: ");
            double newPrice = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            itemToUpdate.setQuantity(newQuantity);
            itemToUpdate.setPrice(newPrice);

            if (itemToUpdate instanceof updateProduct) {
                ((updateProduct) itemToUpdate).setUpdateItem("Updated on " + LocalDate.now());
            }
            
            LoadingScreen.loading();
            LoadingScreen.clearConsole();
            System.out.println("Product updated successfully!");
            LoadingScreen.delay();
        } else if (updateChoice.equalsIgnoreCase("N")) {
            LoadingScreen.delay();
            System.out.println("Update canceled.");
        } else {
            System.out.println("Invalid input. Please enter 'Y' or 'N'.");
        }
    }

    private InventoryItem findItemByName(String name) {
        for (InventoryItem item : inventory) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }
}