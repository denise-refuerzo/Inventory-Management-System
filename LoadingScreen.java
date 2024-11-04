public class LoadingScreen {
    public static void loading(){
    try {
        for (int i = 0; i < 10; i++) {
            String[] spinner = {"|", "/", "-", "\\"};
            System.out.print("\rLoading " + spinner[i % spinner.length]);
            Thread.sleep(200);
        }
    } catch (Exception e) {
        //Exception
        Thread.currentThread().interrupt();
    }
    System.out.println("\n------------------------------");
}

    public static void clearConsole(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush();
    }
}

