import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
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
            System.out.println("3. Update Quantity");
            System.out.println("4. Remove Item");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
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
            // case 3 -> updateQuantity();
            // case 4 -> removeItem();
            // case 5 -> running = false;
            default:
            System.out.println("Invalid choice. Please try again.");
        }
    }
} 

    private static void addHardwareItem() {
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter category (Ex. Sand, Rock, Cement): ");
        String category = scanner.nextLine();

        HardwareItem item = new HardwareItem(name, quantity, price, category);
        inventory.add(item);
        System.out.println("Hardware item added successfully.");
    }

    private static void viewInventory(){
        if(inventory.isEmpty()){
            System.out.println("Inventory is empty.");
        }else{
            System.out.println("Inventory List");
            for(InventoryItem item: inventory){
                System.out.println(item);
            }
        }
    }

}
