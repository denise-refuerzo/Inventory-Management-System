public class Sell implements Action1{

    @Override
    public void option(){
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
                    LoadingScreen.delay();
                    System.out.println("Sold " + quantitySell + " of " + item.getName() + " for ₱" + totalCost);
                    return;
                }else{
                    LoadingScreen.delay();
                    System.out.println("Insufficient stock for " + item.getName());
                    return;
                }
            }
        }
        LoadingScreen.delay();
        System.out.println("Item not found.");
    }
}
