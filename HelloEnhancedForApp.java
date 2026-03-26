// UC5 - Hello App using Enhanced For Loop
// Program Name: HelloEnhancedForApp
// Description: Displays greeting for multiple names using for-each loop or defaults to "Hello, World!"

public class HelloEnhancedForApp {

    public static void main(String[] args) {

        // Check if arguments are provided
        if (args.length > 0) {

            // Enhanced for loop
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }

        } else {
            // Default message
            System.out.println("Hello, World!");
        }
    }
}
