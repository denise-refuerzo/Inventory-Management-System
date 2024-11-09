import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class Main {
    /*Ito ay nag hohold ng object sa InventoryItem class natin*/
    private static ArrayList<InventoryItem> inventory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args){
        LoadingScreen lc = new LoadingScreen();
        System.out.println("================================================");
        System.out.println("     Welcome to Inventory Management System     ");
        System.out.println("================================================");
        System.out.println("------------------------------------------------");
        System.out.println("               Developed By Group 2               ");
        System.out.println("------------------------------------------------");
        System.out.println("================================================");
        System.out.println();

        boolean running = true;
        while (running) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Hardware Item");
            System.out.println("2. View Inventory");
            System.out.println("3. Sell Item");
            System.out.println("4. Remove Item");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
        switch (choice) {
            case 1:
                lc.loading();
                lc.clearConsole();
                addHardwareItem();
                break;
            case 2:
                lc.loading();
                lc.clearConsole();
                viewInventory();
                break;
            case 3:
                lc.loading();
                lc.clearConsole();
                sellItem();
                break;
            case 4:
                lc.loading();
                lc.clearConsole();
                removeItem();
                break;
            case 5:
                lc.loading();
                lc.clearConsole();
                exit();
            default:
            System.out.println("Invalid choice. Please try again.");
        }
    }
} 

    private static void addHardwareItem() {
        // This function ay para sa case 1 natin which is add item hehe lab u all
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
        System.out.println("Hardware item added successfully.");
    }

    private static void viewInventory(){
        // ito naman ay para sa case 2 to view the item hahahah
        if(inventory.isEmpty()){
            System.out.println("Inventory is empty.");
        }else{
            System.out.println("Inventory List");
            for(InventoryItem item: inventory){
                System.out.println(item);
            }
        }
    }

    private static void sellItem(){
        // Itong function na'to ay para sa case 3 para ibenta yung product natin hehehehe
        System.out.println("------------------------------------------------");
        System.out.println("                  SELL ITEM              ");
        System.out.println("------------------------------------------------");
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
            System.out.println("Sold " + quantitySell + " of " + item.getName() + " for ₱" + totalCost);
            return;
        }else{
            System.out.println("Insufficient stock for " + item.getName());
            return;
            }
        }
    }
        System.out.println("Item not found.");
}

    private static void removeItem(){
        // function for case 4 to remove item
        System.out.println("------------------------------------------------");
        System.out.println("                  REMOVE ITEM              ");
        System.out.println("------------------------------------------------");
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();

        boolean itemFound = false;
        // Itong iterator ay para sa InventoryItem object inaallow nya mag loop yung ArrayList natin haha.
        Iterator<InventoryItem> iterator = inventory.iterator();

        while (iterator.hasNext()) {
            InventoryItem item = iterator.next();{
                /*Remove the item directly*/
                iterator.remove();
                itemFound = true;
                System.out.println("The item is successfully removed.");
                break;
                }
            }
            if (!itemFound) {
                System.out.println("Item not found.");
        }
    }

    private static void exit(){
            System.out.println("------------------------------------------------");
            System.out.println("                  BYEE:)              ");
            System.out.println("------------------------------------------------");
            System.out.println("Exiting the program...");
            System.exit(0);
            }
}
