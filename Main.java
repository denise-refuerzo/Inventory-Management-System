import javax.swing.text.View;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<InventoryItem> inventory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LoadingScreen lc = new LoadingScreen();
        Banner b = new Banner();
        Action1 addItem = new Add(inventory);
        Action viewItem = new viewInventory(inventory);
        Action sellItem = new Sell(inventory);
        Action updateItem = new Update(inventory);
        Action removeItem = new Remove(inventory);
        Action exitProgram = new Exit();
        b.welcome();
        
        boolean running = true;
        while (running) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Hardware Item");
            System.out.println("2. View Inventory");
            System.out.println("3. Sell Item");
            System.out.println("4. Remove Item");
            System.out.println("5. Update Item");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    lc.clearConsole();
                    lc.loading();
                    lc.clearConsole();
                    addItem.option();
                    break;
                case 2:
                    lc.clearConsole();
                    lc.loading();
                    lc.clearConsole();
                    viewItem.option();
                    break;
                case 3:
                    lc.clearConsole();
                    lc.loading();
                    lc.clearConsole();
                    sellItem.option();
                    break;
                case 4:
                    lc.clearConsole();
                    lc.loading();
                    lc.clearConsole();
                    removeItem.option();
                    break;
                case 5:
                    lc.clearConsole();
                    lc.loading();
                    lc.clearConsole();
                    updateItem.option();
                    break;
                case 6:
                    lc.clearConsole();
                    lc.loading();
                    lc.clearConsole();
                    exitProgram.option();
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}