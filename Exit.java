public class Exit implements Action1{

    @Override
    public void option(){
        System.out.println("------------------------------------------------");
        System.out.println("                  BYEE:)              ");
        System.out.println("------------------------------------------------");
        System.out.println("Exiting the program...");
        System.exit(0);
    }
}
