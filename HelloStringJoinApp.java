// UC7 - Hello App using String.join()
// Program Name: HelloStringJoinApp
// Description: Displays greeting for multiple names using String.join() or defaults to "Hello, World!"

public class HelloStringJoinApp {

    public static void main(String[] args) {

        // Check if arguments are provided
        if (args.length > 0) {

            String combinedNames = String.join(", ", args);
            System.out.println("Hello, " + combinedNames + "!");

        } else {
            // Default message
            System.out.println("Hello, World!");
        }
    }
}
