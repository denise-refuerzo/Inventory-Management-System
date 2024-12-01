public class View implements Action1{


    @Override
    public void option() {
        System.out.println("------------------------------------------------");
        System.out.println("                  VIEW ITEM              ");
        System.out.println("------------------------------------------------");
        // ito naman ay para sa case 2 to view the item hahahah
        if(inventory.isEmpty()){
            System.out.println("Inventory is empty.");
            LoadingScreen.delay();
        }else{
            LoadingScreen.clearConsole();
            System.out.println("Inventory List");
            for(InventoryItem item: inventory){
                System.out.println(item);
            }
        }
    }
}
