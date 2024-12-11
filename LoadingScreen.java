import java.io.IOException;
public class LoadingScreen
{
    public static void loading(){
        try {
            int barLength = 50; // Length of the loading bar
            int waveWidth = 10; // Width of the wave effect

            // Run the animation for 100 cycles
            for (int i = 0; i < 50; i++) {
                StringBuilder bar = new StringBuilder();

                // Build the loading bar with a "wave" effect
                for (int j = 0; j < barLength; j++) {
                    if ((j + i) % barLength < waveWidth) {
                        bar.append("=");
                    } else {
                        bar.append("-");
                    }
                }

                // Print the loading bar
                System.out.print("\r[" + bar + "] Loading");

                Thread.sleep(50); // Adjust speed of animation
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Print final message
        System.out.println("\n------------------------------");
    }

    //edited=A
    public static void clearConsole(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    //added
    public static void delay(){
        try {
            Thread.sleep(1000); // 10,000 milliseconds = 10 seconds
        } catch (InterruptedException e) {
            System.err.println(" ");
        }
    }

}
