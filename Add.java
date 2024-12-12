import java.util.*;

public class Add implements Action1{
    private ArrayList<InventoryItem> inventory;
    private static final Scanner scanner = new Scanner(System.in);

    public Add(ArrayList<InventoryItem> inventory){
        this.inventory = inventory;
    }

    @Override
    public void option(){
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
        LoadingScreen.clearConsole();
        LoadingScreen.loading();
        LoadingScreen.clearConsole();
        System.out.println("Hardware item added successfully.");
        LoadingScreen.delay();
    }
}
