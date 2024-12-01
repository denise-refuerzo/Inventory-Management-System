import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Action extends LoadingScreen { //edited
    private static final ArrayList<InventoryItem> inventory = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);


    public static void addHardwareItem() {
        // This function ay para sa case 1 natin which is add item hehe
        System.out.println("------------------------------------------------");
        System.out.println("                   ADD ITEM               ");
        System.out.println("------------------------------------------------");
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter category (Ex. Sand, Rock, Cement): ");
        String category = scanner.nextLine();

        /*Itong class HardwareItem na may object na item na may constructor
        na nag aaccept ng name, quantity, price, category*/
        HardwareItem item = new HardwareItem(name, quantity, price, category);
        inventory.add(item);
        clearConsole();
        loading();
        clearConsole();
        System.out.println("Hardware item added successfully.");
        delay();
    }

    public static void viewInventory(){

        System.out.println("------------------------------------------------");
        System.out.println("                  VIEW ITEM              ");
        System.out.println("------------------------------------------------");
        // ito naman ay para sa case 2 to view the item hahahah
        if(inventory.isEmpty()){
            System.out.println("Inventory is empty.");
            delay();
        }else{
            clearConsole();
            System.out.println("Inventory List");
            for(InventoryItem item: inventory){
                System.out.println(item);
            }
        }
    }

    public static void sellItem(){
        // Itong function na'to ay para sa case 3 para ibenta yung product natin hehehehe
        System.out.println("------------------------------------------------");
        System.out.println("                  SELL ITEM              ");
        System.out.println("------------------------------------------------");
        System.out.println("Inventory List");
        for(InventoryItem item: inventory){
            System.out.println(item);
        }
        System.out.println();
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter Quantity Sell: ");
        int quantitySell = scanner.nextInt();

        for(InventoryItem item : inventory){
        /*This line ay chinicheck if yung ininput ni
        user ay nag mamatch sa Item Name*/
            if(item.getName().equalsIgnoreCase(itemName)){
            /*Ito naman ay chinicheck if yung
            yung current stock ng item ay
            greater than or equal to quantitySell*/
                if (item.getQuantity() >= quantitySell) {
                    item.setQuantity(quantitySell);
                    double totalCost = item.getPrice() * quantitySell;
                    delay();
                    System.out.println("Sold " + quantitySell + " of " + item.getName() + " for ₱" + totalCost);
                    return;
                }else{
                    delay();
                    System.out.println("Insufficient stock for " + item.getName());
                    return;
                }
            }
        }
        delay();
        System.out.println("Item not found.");
    }

    public static void removeItem(){
        // function for case 4 to remove item

        System.out.println("------------------------------------------------");
        System.out.println("                  REMOVE ITEM              ");
        System.out.println("------------------------------------------------");
        for(InventoryItem item: inventory){
            System.out.println(item);
        }
        System.out.println();
        delay();
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
                    delay();
                    break;
                }
            }
        }
        if (!itemFound) {
            System.out.println("Item not found.");
        }
    }

    public static InventoryItem findItemByName(String itemName) {
        for (InventoryItem item : inventory) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }

    public static void updateItem() {
        System.out.println("------------------------------------------------");
        System.out.println("                  UPDATE ITEM              ");
        System.out.println("------------------------------------------------");
        for(InventoryItem item: inventory){
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
            scanner.nextLine();

            itemToUpdate.setPrice(newPrice);
            itemToUpdate.setQuantity(newQuantity);

            if (itemToUpdate instanceof updateProduct) {
                delay();
                ((updateProduct) itemToUpdate).setUpdateItem("Updated on " + java.time.LocalDate.now());
            }
            loading();
            clearConsole();
            System.out.println("Product updated successfully!");
            delay();
        } else if (updateChoice.equalsIgnoreCase("N")) {
            delay();
            System.out.println("Update canceled.");
        } else {

            System.out.println("Invalid input. Please enter 'Y' or 'N'.");
        }
    }




    public static void exit(){
        System.out.println("------------------------------------------------");
        System.out.println("                  BYEE:)              ");
        System.out.println("------------------------------------------------");
        System.out.println("Exiting the program...");
        System.exit(0);
    }


}
