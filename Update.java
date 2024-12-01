public class Update implements Action1{

    @Override
    public void option(){
        System.out.println("------------------------------------------------");
        System.out.println("                  UPDATE ITEM              ");
        System.out.println("------------------------------------------------");
        for(InventoryItem item: inventory){
            System.out.println(item);
        }
        System.out.println();
        System.out.print("Enter product name: ");
        String itemName = scanner.nextLine();

        InventoryItem itemToUpdate = Action1.findItemByName(itemName);

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
                LoadingScreen.delay();
                ((updateProduct) itemToUpdate).setUpdateItem("Updated on " + java.time.LocalDate.now());
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
}
