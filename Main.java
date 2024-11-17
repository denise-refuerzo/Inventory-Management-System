import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LoadingScreen lc = new LoadingScreen();
        Banner b = new Banner();
        Action a = new Action();

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
                    a.addHardwareItem();
                    break;
                case 2:
                    lc.clearConsole();
                    lc.loading();
                    lc.clearConsole();
                    a.viewInventory();
                    break;
                case 3:
                    lc.clearConsole();
                    lc.loading();
                    lc.clearConsole();
                    a.sellItem();
                    break;
                case 4:
                    lc.clearConsole();
                    lc.loading();
                    lc.clearConsole();
                    a.removeItem();
                    break;
                case 5:
                    lc.clearConsole();
                    lc.loading();
                    lc.clearConsole();
                    a.updateItem();
                    break;
                case 6:
                    lc.clearConsole();
                    lc.loading();
                    lc.clearConsole();
                    a.exit();
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}