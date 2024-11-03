import java.util.Scanner;
import java.io.IOException;

public class Option{

    public void WelcomePage(){
        System.out.println("================================================");
        System.out.println("     Welcome to Inventory Management System     ");
        System.out.println("================================================");
        System.out.println("------------------------------------------------");
        System.out.println("               Developed By Group 2               ");
        System.out.println("------------------------------------------------");
        System.out.println("================================================");
        System.out.println();
        System.out.println("Please select an option to begin:");
        System.out.println("1. View Product");
        System.out.println("2. -----");
        System.out.println("3. -----");
        System.out.println("4. -----");
        System.out.println("5. -----");
        System.out.println("6. Exit");
        System.out.print("Enter option: ");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        Option option;

        // Check user's option choice
        switch (choice) {
            case 1:
                option = new ViewProduct();
                loadingScreen();
                clearConsole();
                break;
            default:
                break;
        }
    }

    //Escape code to clear the console
    public static void clearConsole(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush();
    }

    public static void loadingScreen(){
        try {
            for (int i = 0; i < 10; i++) {
                String[] spinner = {"|", "/", "-", "\\"};
                System.out.print("\rLoading " + spinner[i % spinner.length]);
                Thread.sleep(300);
            }
        } catch (Exception e) {
            //Exception
            Thread.currentThread().interrupt();
        }
        System.out.println("\nLoading Complete!");
    }
}
