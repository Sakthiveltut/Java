public class ShutdownHookExample {
    public static void main(String[] args) {
        // Registering the shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                cleanup();
            }
        });

        System.out.println("Program started...");

        // Simulating program execution
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Exiting the program
        System.out.println("Exiting program...");
        System.exit(0); // Explicitly exit the program
    }

    // Method to be called before exiting the program
    private static void cleanup() {
        System.out.println("Performing cleanup before exiting...");
        // Your cleanup logic goes here
    }
}
